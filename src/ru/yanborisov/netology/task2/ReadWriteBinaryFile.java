package ru.yanborisov.netology.task2;

import java.io.*;

/**
 * Написать программу, которая будет записывать и считывать бинарный файл.
 */
public class ReadWriteBinaryFile {

    public static void main(String[] args) throws IOException {

        Person max = new Person("Максим", 26, 1.91, true);

        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"));
        dos.writeUTF(max.getName());
        dos.writeInt(max.getAge());
        dos.writeDouble(max.getHeight());
        dos.writeBoolean(max.isMarried());
        dos.close();

        System.out.println("Файл зписан");

        DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"));
        String name = dis.readUTF();
        int age = dis.readInt();
        double height = dis.readDouble();
        boolean married = dis.readBoolean();
        dis.close();

        System.out.printf("Имя: %s  Возраст: %d  Рост: %f  Семейное положение: %b",
                name, age, height, married);
    }
}

class Person {
    private final String name;
    private final int age;
    private final double height;
    private final boolean married;

    public Person(String n, int a, double h, boolean m) {
        this.name = n;
        this.height = h;
        this.age = a;
        this.married = m;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public boolean isMarried() {
        return married;
    }
}
