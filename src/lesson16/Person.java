package lesson16;

import java.io.Serializable;

public class Person implements Serializable {

    public static final long serialVersionUID = 1L;

    public static int a = 5;
    private String username;
    private transient String password;
    private Integer age;

    public Person(String username, String password) {
        this.username = username;
        this.password = password;
    }

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int howAreYou() {
        if (age < 10) {
            return 8;
        } else if (age > 30) {
            return 3;
        } else if (password.length() < 5) {
            return 10;
        } else if (username.length() > 15){
            return 2;
        } else {
            return 5;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
