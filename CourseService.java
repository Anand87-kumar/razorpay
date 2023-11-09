package com.anand.razorpay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anand.razorpay.model.Course;

import java.util.List;
import java.util.Optional;

@Service
public interface CourseService {
    List<Course> getAllCourses();
    Optional<Course> getCourseById(Long id);
    Course createOrUpdateCourse(Course course);
    void deleteCourse(Long id);
}
