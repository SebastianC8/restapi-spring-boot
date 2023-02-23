package com.restapi.learning.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Employee")
public class Employee
{
    @Id //Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincrement
    private Integer id;
    @Column(unique = true, length = 13) // Unique field
    private String identification;
    private String firstname;
    private String lastname;
    private Integer age;
    private String phone;
    private Date birhtdate;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getIdentification() {
        return identification;
    }

    public void setfirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getfirstname() {
        return firstname;
    }

    public void setlastname(String lastname) {
        this.lastname = lastname;
    }

    public String getlastname() {
        return lastname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setBirhtdate(Date birhtdate) {
        this.birhtdate = birhtdate;
    }

    public Date getBirthdate() {
        return birhtdate;
    }
}
