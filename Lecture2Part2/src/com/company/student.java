package com.company;

public class student extends Person{
    private String studentID;
    private String curriculumName;

    public student(String personalID, String name, String studentID, String curriculumName) {
        super(personalID, name);
        this.studentID = studentID;
        this.curriculumName = curriculumName;
    }

    public String getCurriculumName() {
        return curriculumName;
    }

    public void setCurriculumName(String curriculumName) {
        this.curriculumName = curriculumName;
    }
    public boolean isstudentIDValid (){
        if (this.studentID.matches("[0-9] + ") && this.studentID.length() ==7){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "student{" +
                "studentID='" + studentID + '\'' +
                ", curriculumName='" + curriculumName + '\'' +
                '}';
    }
}
