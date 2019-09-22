package com.company;

public class Person {
//Person: personalID,Name, validation for personalID, should contain 11 digits
//  Teacher: personalID, name, roomNumber
//    Student: personalID, name, studentID, curriculumName
private String personalID;
private String name;

    public Person(String personalID, String name) {
        this.personalID = personalID;
        this.name = name;
    }

    public String getPersonalID() {
        return personalID;
    }

    public String getName() {
        return name;
    }
//setters for name only coz, personalID is unique
    public void setName(String name) {
        this.name = name;
    }

    public boolean ispersonalIDValid(){
        if (this.personalID.matches("[0-9] + ") && this.personalID.length() ==11){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personalID='" + personalID + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
