package com.learn.research.service;

import com.learn.research.model.Employee;
import com.learn.research.repository.EmployeeRespository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRespository employeeRespository;

    public EmployeeService(EmployeeRespository employeeRespository) {
        this.employeeRespository = employeeRespository;
    }

    public Employee findByEmployeeId(String employeeId) {
        return employeeRespository.findByEmpId(employeeId);
    }
}
