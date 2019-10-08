package com.fonyou.employees.service;

import java.util.List;

import com.fonyou.employees.entity.Employee;

public interface EmployeeServiceInterface {

	List<Employee> buscarTodos();
	Employee buscarPorId(int idEmpleado);
	void guardar(Employee empleado);
	void eliminar(int idEmpleado);
}
