package com.company;

public class Main {

    public static void main(String[] args) {
    Student student1 = new Student("Vasil", "Petrov", 21, Sex.MALE, 1001, 1);
    Student student2 = new Student("Ivan", "Ivanov", 21,Sex.MALE, 1002, 1);
    Student student3 = new Student("Olya", "Sidorova", 21,Sex.FEMALE, 1003, 1 );


    Group group1 = new Group();

    group1.addStudent(student1);
    group1.addStudent(student2);
    group1.addStudent(student3);

        System.out.println(group1.toString());

    }
}