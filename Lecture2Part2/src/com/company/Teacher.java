package com.company;

public class Teacher extends Person{
//    private String name;
    private int roomNumber;

    public Teacher(String personalID, String name, int roomNumber) {
//        super = super class "Person"
        super(personalID, name);
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "roomNumber=" + roomNumber +
                '}';
    }
}
