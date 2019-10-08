package com.fonyou.employees.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fonyou.employees.entity.Employee;
import com.fonyou.employees.service.EmployeeServiceInterface;

@RestController
@RequestMapping("/api")
public class EmployeesController {
	
	@Autowired
	private EmployeeServiceInterface employeeService;

	@GetMapping("/employees")
	public List<Employee> buscarTodos(){
		return employeeService.buscarTodos();
	}
	
	@PostMapping("/employee")
	public Employee guardar(@RequestBody Employee empleado) {
		employeeService.guardar(empleado);
		return empleado;
	}
	
	@PutMapping("/employee")
	public Employee modificar(@RequestBody Employee empleado) {
		employeeService.guardar(empleado);
		return empleado;
	}
	
	@DeleteMapping("/employee")
	public String eliminar(@RequestBody Employee empleado) {
		employeeService.eliminar(empleado.getId());
		return "empleado eliminado";
	}
	
	@GetMapping("/employee/{id}")
	public Employee employee (@PathVariable("id") int idEmpleado) {
		return employeeService.buscarPorId(idEmpleado);
	}
}
