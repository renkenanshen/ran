package com_ran_demo1;

public class Student {
    private String name;
    private int age;
    private String sex;
    public static String teatherName;

    public Student() {
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void study(){
        System.out.println(name + "学习");
    }
    public void show(){
        System.out.println(name+" "+age+" "+sex+" "+teatherName);
    }
}
