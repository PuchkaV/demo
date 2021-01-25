package com.company;

public class Human {
    private String name;
    private String soname;
    private int age;
    private Sex sex;

    public Human(String name, String soname, int age, Sex sex) {
        this.name = name;
        this.soname = soname;
        this.age = age;
        this.sex = sex;
    }

    public Human(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSoname() {
        return soname;
    }

    public void setSoname(String soname) {
        this.soname = soname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "name= " + name + ", soname= " + soname + ", age= " + age + ", sex=" + sex;
    }
}
