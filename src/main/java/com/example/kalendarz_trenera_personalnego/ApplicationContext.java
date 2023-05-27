package com.example.kalendarz_trenera_personalnego;

import com.example.kalendarz_trenera_personalnego.model.UserModel;

public class ApplicationContext {

    private static ActiveUser activeUser;

    public static void setActiveUser(UserModel userModel) {
        activeUser = new ActiveUser(
                userModel.getUsername(),
                userModel.getName(),
                userModel.getUserRole()
        );
    }

    public static ActiveUser getActiveUser() {
        return activeUser;
    }
}
