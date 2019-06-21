package com.app.repo;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
Page<Employee> findByEmpSal(Double empSal,Pageable p);
}
