
package com.itn.studentmanagementsystem.model;

import java.time.LocalDate;



public class User {
    private int id;
    private String fName;
    private String lName;
    private LocalDate dob;
    private String eduction;
    private String username;
    private String email;
    private String password;
    private String role;

    public User(int id, String fName, String lName, LocalDate dob, String eduction, String username, String email, String password, String role) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.dob = dob;
        this.eduction = eduction;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEduction() {
        return eduction;
    }

    public void setEduction(String eduction) {
        this.eduction = eduction;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", fName=" + fName + ", lName=" + lName + ", dob=" + dob + ", eduction=" + eduction + ", username=" + username + ", email=" + email + ", password=" + password + ", role=" + role + '}';
    }

    
}
