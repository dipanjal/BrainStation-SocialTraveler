package com.traveler.social.models.entities;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.sql.Timestamp;

public class User {
    private int id;
    @Size(min = 2, max = 10,message = "first name must contains 2-10 characters")
    private String firstName;
    @Size(min = 2, max = 10,message = "last name must contains 2-10 characters")
    private String lastName;
    @NotNull(message = "email cannot be empty")
    @Pattern(regexp = "^[a-zA-Z0-9]+([._-][a-zA-Z0-9]+)*@[a-zA-Z0-9]{2,50}([.][a-z]{2,5})+$",
        message = "Invalid Email Format")
    private String email;
    @Pattern(regexp = "^([+]88)?01[6789][0-9]{8}$", message = "number format invalid")
    private String phone;
    @NotNull(message = "password cannot be empty")
    @Size(min = 6, max = 20, message = "password must contains 6-20 characters")
    private String password;
    private Timestamp createdAt;

    public User() {
    }

    public User(int id, String firstName, String lastName, String email, String phone, String password, Timestamp createdAt) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}