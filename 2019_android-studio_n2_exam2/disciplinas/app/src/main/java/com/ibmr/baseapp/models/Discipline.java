package com.ibmr.baseapp.models;

public class Discipline {
    private String name, professor, dayOfWeek, room;
    private int image;

    public Discipline() {}

    public Discipline(String name, String professor, String dayOfWeek, String room, int image) {
        this.name = name;
        this.professor = professor;
        this.dayOfWeek = dayOfWeek;
        this.room = room;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
