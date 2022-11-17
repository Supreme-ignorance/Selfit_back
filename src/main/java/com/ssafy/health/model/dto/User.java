package com.ssafy.health.model.dto;

public class User {
    private String id;
    private String password;
    private int level;
    private int exp;
    private String name;
    private int height;
    private int weight;
    private String nickname;
    private String email;
    private int age;
    private Gender gender;
    private boolean InfoDisclose;

    public User() {
    }

    public User(String id, String password, String name, int height, int weight, String nickname, String email, int age, Gender gender) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.nickname = nickname;
        this.email = email;
        this.age = age;
        this.gender = gender;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isInfoDisclose() {
        return InfoDisclose;
    }

    public void setInfoDisclose(boolean infoDisclose) {
        InfoDisclose = infoDisclose;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", level=" + level +
                ", exp=" + exp +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", InfoDisclose=" + InfoDisclose +
                '}';
    }
}

enum Gender {man, woman}