package com.fonyou.employees.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fonyou.employees.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
