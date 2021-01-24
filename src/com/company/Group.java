package com.company;

public class Group {
    private Student[] students = new Student[10];

    public Group(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void addStudent(Student student) throws ArrayLengthException {

        try {
            for (int i = 0; ; i++) {
            if (i > students.length) throw new ArrayLengthException();
            if (students[i] != null) continue;
            students[i] = student;
            }
        }
        catch (ArrayLengthException e){
            System.out.println(e.getMessage());
        }
    }
}
