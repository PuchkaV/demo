package com.company;

import java.util.Arrays;
import static java.util.Arrays.sort;

public class Group {
    private Student[] students = new Student[10];

    public Group(){

    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void addStudent(Student student) {

        for (int i = 0; i < students.length; i++) {
            try {
                if (students[i] != null && i == (students.length - 1)) throw new ArrayLengthException();
                if (students[i] == null){
                    students[i] = student;
                    break;
                }

            }
            catch(ArrayLengthException e){
            System.out.println(e.getMessage());
            }
        }
    }

    public void deleteStudent(int gradebookNumber) {
        for(int i = 0; i < students.length; i++) {
            try {
                if (students[i] == null && i == (students.length - 1)){
                    throw new GradebookNumberFalse();
                }

                if (students[i] != null && students[i].getGradebookNumber() == gradebookNumber){
                    students[i] = null;
                    break;
                }
            }
            catch (GradebookNumberFalse e) {
                System.out.println(e.getMassage());
            }
        }

    }

    @Override
    public String toString() {

       return Arrays.toString(students);
    }
}
