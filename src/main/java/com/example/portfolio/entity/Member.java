package com.example.portfolio.entity;


import javax.persistence.*;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int num;

    @Column
    private String name;

    @Column
    private String id;

    @Column
    private  String password;

    @Column
    private String email;

    @Column
    private int age;

    //생성자
    public Member(){}

    //getter와 setter

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //toString
    @Override
    public String toString() {
        return "Member{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
    //객체 생성자
    public Member(int num, String name, String id, String password, String email, int age) {
        this.num = num;
        this.name = name;
        this.id = id;
        this.password = password;
        this.email = email;
        this.age = age;
    }
}
