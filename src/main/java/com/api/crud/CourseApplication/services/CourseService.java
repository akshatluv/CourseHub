package com.api.crud.CourseApplication.services;

import com.api.crud.CourseApplication.entities.Course;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();

    public Course getCourse(long courseID);

    public Course addCourse(Course course);

    public Course updateCourse(Course course);

    public void deleteCourse(long parseLong);
    }

