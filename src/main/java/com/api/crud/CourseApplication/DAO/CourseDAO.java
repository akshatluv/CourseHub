package com.api.crud.CourseApplication.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.crud.CourseApplication.entities.Course;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDAO extends JpaRepository<Course, Long> {
}
