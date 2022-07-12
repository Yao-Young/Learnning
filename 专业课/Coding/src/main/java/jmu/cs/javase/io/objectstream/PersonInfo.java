package jmu.cs.javase.io.objectstream;

import java.io.Serializable;

public class PersonInfo implements Serializable {


    private static final long serialVersionUID = 1L;
    private String name;
    private String sex;
    private int age;

    public PersonInfo(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String toString() {
        return new String("Name is: " + name + ", Sex is: " + sex + ", Age is: " + age);
    }

}
