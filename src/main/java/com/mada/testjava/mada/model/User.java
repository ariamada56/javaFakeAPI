package com.mada.testjava.mada.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("name")
    private String name;
    @SerializedName("username")
    private String username;
    @SerializedName("gender")
    private String gender;

    public User(String name, String username, String gender) {
        this.name = name;
        this.username = username;
        this.gender = gender;
    }
public User() {

}
    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getGender() {
        return gender;
    }
@JsonCreator
    public void setName(String name) {
        this.name = name;
    }
@JsonCreator
    public void setUsername(String username) {
        this.username = username;
    }
@JsonCreator
    public void setGender(String gender) {
        this.gender = gender;
    }
}
