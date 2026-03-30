//package com.proj.dao;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.*;
//import org.springframework.stereotype.Repository;
//
//import com.proj.entity.Course;
//
//@Repository
//public class CourseDao {
//
//    @Autowired
//    private JdbcTemplate jdbc;
//
//    // 🔹 Get All
//    public List<Course> getCourses() {
//        String sql = "SELECT * FROM course";
//
//        return jdbc.query(sql, (rs, rowNum) -> {
//            Course c = new Course();
//            c.setId(rs.getInt("id"));
//            c.setName(rs.getString("name"));
//            c.setInstructor(rs.getString("instructor"));
//            return c;
//        });
//    }
//
//    // 🔹 Save
//    public void saveCourse(Course course) {
//        String sql = "INSERT INTO course(name, instructor) VALUES(?, ?)";
//        jdbc.update(sql, course.getName(), course.getInstructor());
//    }
//
//    // 🔹 Delete
//    public void deleteCourse(int id) {
//        String sql = "DELETE FROM course WHERE id=?";
//        jdbc.update(sql, id);
//    }
//
//    // 🔹 Get by ID
//    public Course getCourseById(int id) {
//        String sql = "SELECT * FROM course WHERE id=?";
//
//        return jdbc.queryForObject(sql, new Object[]{id}, (rs, rowNum) -> {
//            Course c = new Course();
//            c.setId(rs.getInt("id"));
//            c.setName(rs.getString("name"));
//            c.setInstructor(rs.getString("instructor"));
//            return c;
//        });
//    }
//
//    // 🔹 Update
//    public void updateCourse(Course course) {
//        String sql = "UPDATE course SET name=?, instructor=? WHERE id=?";
//        jdbc.update(sql, course.getName(), course.getInstructor(), course.getId());
//    }
//}