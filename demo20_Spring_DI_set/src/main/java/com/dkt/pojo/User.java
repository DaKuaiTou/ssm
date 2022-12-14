package com.dkt.pojo;

/**
 * @author: dkt
 * @Pcakage: com.dkt.pojo.User
 * @Date: 2022年11月26日 17:09
 * @Description:
 */
public class User {
    private String userName;
    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }

    public User() {
    }

    public User(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
