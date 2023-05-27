package com.example.kalendarz_trenera_personalnego.model;

import com.example.kalendarz_trenera_personalnego.api.UserRole;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity(name = "user_model")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserModel implements UserDetails {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "password")
    private String password;

    @Column (name = "name")
    private String name;

    @Column (name = "surname")
    private String surname;

    @Email
    @Column(name = "email", unique = true)
    private String email;

    @Column (name = "phone_number")
    private String phoneNumber;

    @Column (name = "gender")
    private String gender;

    @Column (name = "birthday_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthdayDate;

    @Column(name = "user_role")
    private UserRole userRole = UserRole.USER;

    private boolean accountNonLocked;

    @ManyToMany
    @JoinTable(
            name = "user_event",
            joinColumns = {@JoinColumn(name = "user_model_id")},
            inverseJoinColumns = {@JoinColumn(name = "event_model_id")}
    )
    private List<EventModel> eventModelList = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userModel")
    private List<OpinionModel> opinionModelList = new ArrayList<>();

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(() -> "read");
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setAccountNonLocked(Boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public boolean getAccountNonLocked() {
        return accountNonLocked;
    }
}
