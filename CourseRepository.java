package com.anand.razorpay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anand.razorpay.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}

