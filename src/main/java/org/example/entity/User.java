package org.example.entity;

public class User {
    private String name;
    private String email;
    private String userPassword;
    private String altEmail;
    public User(){}
    public User(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getUserPassword(){
        return userPassword;
    }
    public String getAltEmail(){
        return altEmail;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setUserPassword(String userPassword){
        this.userPassword = userPassword;
    }
}
