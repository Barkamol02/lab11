package com.example.lab11;

class Course {
    private String title;
    private String duration;

    public Course(String title, String duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }
}