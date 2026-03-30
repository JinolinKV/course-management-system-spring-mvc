package com.proj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.proj.entity.Course;
import com.proj.service.CourseService;

@Controller
public class CourseController {

    @Autowired
    private CourseService service;

    @GetMapping("/")
    public String home(Model model) {
        List<Course> list = service.getCourses();
        model.addAttribute("courses", list);
        return "home";
    }

    @GetMapping("/add")
    public String addPage(Model model) {
        model.addAttribute("course", new Course());
        return "addCourse";
    }

    @PostMapping("/save")
    public String saveCourse(@ModelAttribute Course course) {
        service.saveOrUpdate(course);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteCourse(@RequestParam("id") int id) {
        service.deleteCourse(id);
        return "redirect:/";
    }

    @GetMapping("/edit")
    public String editCourse(@RequestParam("id") int id, Model model) {
        Course course = service.getCourseById(id);
        model.addAttribute("course", course);
        return "addCourse";
    }
}