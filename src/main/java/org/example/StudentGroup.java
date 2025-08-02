package org.example;

public class StudentGroup {
    String groupName;
    int studentCount;

    StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }
    void setGroupName(String newGroupName){
        this.groupName=newGroupName;
    }
    String getGroupName(){
        return this.groupName;
    }
    void setStudentCount(int newStudentCount){
        this.studentCount=newStudentCount;
    }
    int getStudentCount(){
        return this.studentCount;
    }

    void printInfo(){
        System.out.println("Название группы: "+groupName + " Количество студентов: " + studentCount);
    }
}
