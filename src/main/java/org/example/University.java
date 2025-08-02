package org.example;

public class University {
    static String universityName;
    final int STUDENT_ID;
    String studentName;

    University(int id,String nameStudent){
        this.studentName=nameStudent;
        this.STUDENT_ID=id;
    }

    static void changeUniversityName(String newName){
        universityName=newName;
    }

    String getStudentName(){
        return this.studentName;
    }

    void printStudentInfo(){
        System.out.println("Университет: "+ universityName+" ID Студента: "+ STUDENT_ID + " Имя студента: "+ studentName);
    }
}
