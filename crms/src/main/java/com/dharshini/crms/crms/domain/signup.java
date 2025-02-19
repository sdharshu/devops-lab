package com.dharshini.crms.crms.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="signup")
public class signup {
    @Id
    private String username;
    private String password;
    private String confirmPassword;
    public signup(String username, String password,String confirmPassword) {
        this.username = username;
        this.password = password;
        this.confirmPassword=confirmPassword;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getconfirmPassword() {
        return confirmPassword;
    }
    public void setconfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    
}
