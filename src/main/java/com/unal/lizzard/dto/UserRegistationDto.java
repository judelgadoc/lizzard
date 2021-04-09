package com.unal.lizzard.dto;

public class UserRegistationDto {
    private String firstName;
    private  String lastName;
    private String email;
    private String password;

    public UserRegistationDto(String firstName,String lastName,String email ,String password){
        this.firstName= firstName;
        this.lastName =lastName;
        this.email=email;
        this.password =password;
    }
    public String getFristName(){ return firstName;}

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}
