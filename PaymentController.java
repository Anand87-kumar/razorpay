package com.anand.razorpay.contoller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.anand.razorpay.model.Course;
import com.anand.razorpay.repository.CourseRepository;



@Controller
public class PaymentController {

    @Autowired
    private CourseRepository courseRepo; 

    @GetMapping("/paymentForm")
    public String PaymentForm(Model model) {
        List<Course> courseList = courseRepo.findAll();
        model.addAttribute("courses", courseList); 
        System.out.println("From the showPaymentForm()"); 
        return "paymentForm"; 
    }
   
}

