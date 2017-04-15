package com.thriveng.dao;

/**
 * Created by DoctorSushi on 4/15/17.
 */
public class UserDao {
    Long id;
    String name;
    String email;

    public UserDao() {

    }
    public UserDao(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
