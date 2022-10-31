package com.employee_payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employee_payroll.domain.Employee;
import com.employee_payroll.repository.EmployeeRepository;

@EnableAutoConfiguration
@SpringBootApplication
public class EmployeePayrollApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("employeeRepository")
	private EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		SpringApplication.run(EmployeePayrollApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employeeRepository.save(new Employee(0,"Tanmay","2021-12-16","male",24,"ASE","tanmay@gmail.com","12345678"));
		
	}

}
