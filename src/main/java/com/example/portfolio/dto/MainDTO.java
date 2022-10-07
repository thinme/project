package com.example.portfolio.dto;

public class MainDTO {

    private Integer num;

    private String id;

    private String password;

    public MainDTO(){}

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "MainDTO{" +
                "num=" + num +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public MainDTO(Integer num, String id, String password) {
        this.num = num;
        this.id = id;
        this.password = password;
    }
}
