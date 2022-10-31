package com.employee_payroll.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.employee_payroll.domain.Employee;
import com.employee_payroll.exception.ResourceNotFoundException;
import com.employee_payroll.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	private EmployeeRepository employeeRepository;

	

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
		return employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));

	}

	@Override
	public Employee updateEmployee(Employee employee, long id) {

		Employee employeeDetails = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));

		employeeDetails.setEmp_name(employee.getEmp_name());
		employeeDetails.setDate_of_joining(employee.getDate_of_joining());
		employeeDetails.setGender(employee.getGender());
		employeeDetails.setAge(employee.getAge());
		employeeDetails.setDesignation(employee.getDesignation());
		employeeDetails.setEmail(employee.getEmail());
		employeeDetails.setPassword(employee.getPassword());

		employeeRepository.save(employeeDetails);
		return employeeDetails;
	}

	@Override
	public void deleteEmployee(long id) {

		employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));
		employeeRepository.deleteById(id);
	}
}
