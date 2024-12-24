package ru.maxima.maven.example;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setNam(String nam) {
        this.name = nam;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nam='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
