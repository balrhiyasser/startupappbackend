package com.startup.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.startup.app.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
