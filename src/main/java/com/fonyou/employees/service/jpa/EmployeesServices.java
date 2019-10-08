package com.fonyou.employees.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fonyou.employees.entity.Employee;
import com.fonyou.employees.repository.EmployeeRepository;
import com.fonyou.employees.service.EmployeeServiceInterface;

@Service
public class EmployeesServices implements EmployeeServiceInterface {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> buscarTodos() {
		return employeeRepository.findAll();
	}

	@Override
	public void guardar(Employee empleado) {
		employeeRepository.save(empleado);
	}

	@Override
	public void eliminar(int idEmpleado) {
		employeeRepository.deleteById(idEmpleado);
	}

	@Override
	public Employee buscarPorId(int idEmpleado) {
		return employeeRepository.findById(idEmpleado).orElse(null);
	}
	

}
