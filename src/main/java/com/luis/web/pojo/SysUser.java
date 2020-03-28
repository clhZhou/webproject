package com.luis.web.pojo;


/**
 * @author luis
 * @date 2020/3/28
 */
public class SysUser {
    private String username;
    private String password;
    private String age;
    private String msg;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age='" + age + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
