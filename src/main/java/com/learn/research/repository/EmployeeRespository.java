package com.learn.research.repository;

import com.learn.research.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRespository extends JpaRepository<Employee, String> {

    Employee findByEmpId(String empId);
}
