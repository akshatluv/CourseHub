package com.api.crud.CourseApplication.services;

import com.api.crud.CourseApplication.DAO.CourseDAO;
import com.api.crud.CourseApplication.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDAO courseDao;

    public CourseServiceImpl(){}

    @Override
    public List<Course> getCourses() {
       return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseID) {
        return courseDao.getById(courseID);
    }

    @Override
    public Course addCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
        Course entity= courseDao.getById(parseLong);
        courseDao.delete(entity);
    }
}
