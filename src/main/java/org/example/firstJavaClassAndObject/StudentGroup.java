package org.example.firstJavaClassAndObject;

public class StudentGroup {
    String groupName;
    int studentCount;

    public StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }
    public void setGroupName(String newGroupName){
        this.groupName=newGroupName;
    }
    public String getGroupName(){
        return this.groupName;
    }
    public void setStudentCount(int newStudentCount){
        this.studentCount=newStudentCount;
    }
    public int getStudentCount(){
        return this.studentCount;
    }

    public void printInfo(){
        System.out.println("Название группы: "+groupName + " Количество студентов: " + studentCount);
    }
}
