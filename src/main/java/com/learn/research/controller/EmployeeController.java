package com.learn.research.controller;

import com.learn.research.model.Employee;
import com.learn.research.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee/{employeeId}")
    public Employee getEmployee(@PathVariable String employeeId) {
        return employeeService.findByEmployeeId(employeeId);
    }
}
