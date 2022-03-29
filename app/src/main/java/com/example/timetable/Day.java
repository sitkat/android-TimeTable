package com.example.timetable;

public class Day {
    String num;
    String name;
    String teacher;

    public Day (){

    }

    public Day(String num, String name, String teacher) {
        this.num = num;
        this.name = name;
        this.teacher = teacher;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
