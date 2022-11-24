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
    private boolean infoDisclose;

    public User() {
    }

    public User(String id, String password, int height, int weight, boolean infoDisclose) {
        this.id = id;
        this.password = password;
        this.height = height;
        this.weight = weight;
        this.infoDisclose = infoDisclose;
    }

    public User(String id, String password, int level, int exp, String name, int height, int weight, String nickname, String email, int age, Gender gender, boolean infoDisclose) {
        this.id = id;
        this.password = password;
        this.level = level;
        this.exp = exp;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.nickname = nickname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.infoDisclose = infoDisclose;
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
        return infoDisclose;
    }

    public void setInfoDisclose(boolean infoDisclose) {
        infoDisclose = infoDisclose;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
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
                ", InfoDisclose=" + infoDisclose +
                '}';
    }
}

enum Gender {man, woman}