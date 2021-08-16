package com.example.demo.controller;

import java.util.List;

import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class EmployeeController {
    @Autowired
    EmployeeRepository empRepository;
    @RequestMapping("/emp")
    public String index(Model model){
        List<Employee> empList = empRepository.findAll();
        model.addAttribute("empList", empList);
        return "index";
    }
}
