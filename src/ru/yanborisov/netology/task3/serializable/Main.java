package ru.yanborisov.netology.task3.serializable;

import java.io.*;
import java.util.Objects;

/**
 * Сериализовать объект User (без поля password).
 */
public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        serializeObject();
        deserializeObject();
    }

    private static void deserializeObject() throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("user-serializable.dat"));
        User user = (User) in.readObject();
        System.out.println(user);
        in.close();
    }

    private static void serializeObject() throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user-serializable.dat"));
        User user = new User("123", "password");
        out.writeObject(user);
        out.close();
    }
}

class User implements Serializable {

    private static final long serialVersionUID = 123123123217L;
    private final String login;
    private final transient String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }
}
