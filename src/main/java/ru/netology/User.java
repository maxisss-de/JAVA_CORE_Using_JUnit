package ru.netology;

import java.util.Objects;

public class User {

    private String name;
    private String login;
    private String password;
    private String email;
    private Sex sex;
    private int age;

    public User(String name, String login, String password, String email, Sex sex, int age) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.email = email;
        this.sex = sex;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Sex getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getAge() == user.getAge() && Objects.equals(name, user.name)
                && Objects.equals(getLogin(), user.getLogin()) && Objects.equals(getPassword(),
                user.getPassword()) && Objects.equals(email, user.email) && getSex() == user.getSex();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, getLogin(), getPassword(), email, getSex(), getAge());
    }

    public String toString() {
        return "User{" +
                "name=" + name +
                ", login='" + login + '\'' +
                ", password=" + password +
                ", email=" + email +
                ", sex=" + sex +
                '}';
    }
}

