package com.traveler.social.models.viewmodels;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginForm {

    @NotNull(message = "email cannot be empty")
    @Pattern(regexp = "^[a-zA-Z0-9]+([._-][a-zA-Z0-9]+)*@[a-zA-Z0-9]{2,50}([.][a-z]{2,5})+$",
            message = "Invalid Email Format")
    private String email;

    @NotNull(message = "password cannot be empty")
    @Size(min = 6, max = 20, message = "password must contains 6-20 characters")
    private String password;

    public LoginForm() {
    }

    public LoginForm(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
