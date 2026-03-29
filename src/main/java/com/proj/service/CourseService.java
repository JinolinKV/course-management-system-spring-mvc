package com.proj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.dao.CourseDao;
import com.proj.entity.Course;

@Service
public class CourseService {

    @Autowired
    private CourseDao dao;

    public List<Course> getCourses() {
        return dao.getCourses();
    }

    public Course getCourseById(int id) {
        return dao.getCourseById(id);
    }

    public void deleteCourse(int id) {
        dao.deleteCourse(id);
    }

    public void saveOrUpdate(Course course) {
        if (course.getId() == 0) {
            dao.saveCourse(course);   // INSERT
        } else {
            dao.updateCourse(course); // UPDATE
        }
    }
}