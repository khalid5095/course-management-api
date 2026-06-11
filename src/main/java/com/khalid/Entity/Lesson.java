package com.khalid.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Lesson {

    @Id
    private String id;

    private String name;

    private String content;

    @ManyToOne
    @JoinColumn(name = "Course_id")
    private Course course;

    public Lesson() {
    }

    public Lesson(String id, String name, String content, String course) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.course = new Course(course,"","","");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

}