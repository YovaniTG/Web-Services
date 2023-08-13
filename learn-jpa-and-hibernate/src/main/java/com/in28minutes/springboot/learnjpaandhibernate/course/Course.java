package com.in28minutes.springboot.learnjpaandhibernate.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity //if the bean has the same name of the table then no need to speficy the table name.
//@Entity(name="Course_details")  -- if you have a different name for your table and want to map it with the current bean.

public class Course {
    @Id //sets id to primary key.
    private long id;
   // @Column(name="name") //maps column from H2 DB 'name' to the variable name
    private String name;
   // @Column(name="author") since the bean properties have the same name as DB columns then no need to map
    private String author;

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Course(){

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
