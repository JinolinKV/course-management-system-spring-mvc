package com.proj.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.proj.entity.Course;

@Service
public class CourseService {

    private List<Course> list = new ArrayList<>();

    public CourseService() {
        list.add(new Course(1, "Java", "John"));
        list.add(new Course(2, "Spring", "David"));
    }

    public List<Course> getCourses() {
        return list;
    }

    public Course getCourseById(int id) {
        return list.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void deleteCourse(int id) {
        list.removeIf(c -> c.getId() == id);
    }

    public void saveOrUpdate(Course course) {

        if (course.getId() == 0) {
            // ADD
            course.setId(list.size() + 1);
            list.add(course);
        } else {
            // UPDATE
            for (Course c : list) {
                if (c.getId() == course.getId()) {
                    c.setName(course.getName());
                    c.setInstructor(course.getInstructor());
                }
            }
        }
    }
}