package com.company;

public class Student extends Human {

    private int gradebookNumber;
    private int groupNumber;

    public Student(String name, String soname, int age, Sex sex, int gradebookNumber, int groupNumber) {
        super(name, soname, age, sex);
        this.gradebookNumber = gradebookNumber;
        this.groupNumber = groupNumber;
    }

    public int getGradebookNumber() {
        return gradebookNumber;
    }

    public void setGradebookNumber(int gradebookNumber) {
        this.gradebookNumber = gradebookNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", gradebookNumber= " + gradebookNumber + ", groupNumber= " + groupNumber + "\n";
    }
}
