package com.example.kalendarz_trenera_personalnego;

import com.example.kalendarz_trenera_personalnego.api.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ActiveUser {

    private final String login;
    private final String name;
    private final UserRole userRole;

}
