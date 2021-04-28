package com.example.crud_flyway_1;

import lombok.Data;

import javax.persistence.*;

@Data
//this annotation is used to auto-generate getter and setter
@Entity
//as user is the model we need to annotate it with Entity
@Table(name = "REGISTRATION_USERS")
public class User
{
    //@Id
    @javax.persistence.Id
    //this annotation is used to make id as the primary key
    //@GeneratedValue
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //this annotation is used to make the id field as auto-generated
    private int id;
    private String username;
    private String first_name;
    private String last_name;
    private String email;
    //enhancement from CR
    //change request
    private String mobile;
    private String mobile_number;
}
