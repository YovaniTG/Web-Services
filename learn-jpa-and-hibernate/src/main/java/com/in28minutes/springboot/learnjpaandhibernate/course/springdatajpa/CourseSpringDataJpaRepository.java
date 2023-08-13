package com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//JpaRepository<Course, Long> inside the <> first parameter will make reference to the bean and second to the primary key type, ex Long Id.
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

    //need to follow a naming convention, for ex. findBy[NAMEOFTHEBEANPROPERTY] findByName
            List<Course> findByAuthor(String author);
            List<Course> findByName(String name);
}
