package com.company;

public class GradebookNumberFalse extends Exception {

    public String getMassage (){
        return "There is no student with this gradebook number in the group";
    }
}
