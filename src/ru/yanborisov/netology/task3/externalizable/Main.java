package ru.yanborisov.netology.task3.externalizable;

import java.io.*;

/**
 * Сериализовать объект User (без поля password).
 */
public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        serializeObject();
        deserializeObject();
    }

    private static void deserializeObject() throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("user-externalizable.dat"));
        User user = (User) in.readObject();
        System.out.println(user);
        in.close();
    }

    private static void serializeObject() throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user-externalizable.dat"));
        User user = new User("123", "password");
        out.writeObject(user);
        out.close();
    }

}

class User implements Externalizable {

    private String login;
    private String password;

    public User() {
    }

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
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(login);
        out.writeObject(password);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        login = (String) in.readObject();
        password = (String) in.readObject();
    }
}
