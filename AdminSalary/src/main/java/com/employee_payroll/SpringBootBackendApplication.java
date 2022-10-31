
package com.employee_payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employee_payroll.model.AdminSalary;
import com.employee_payroll.repository.AdminSalaryRepository;


@SpringBootApplication
public class SpringBootBackendApplication implements CommandLineRunner {
     
	
	@Autowired
	@Qualifier("adminSalaryRepository")
	private AdminSalaryRepository adminSalaryRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		adminSalaryRepository.save(new AdminSalary(0,"naveen","two thousand","one thousand","five thosand","feb")); 
		adminSalaryRepository.save(new AdminSalary(0,"ramya","three thousand","two thousand","six thosand","march")); 
		adminSalaryRepository.save(new AdminSalary(0,"sanjan","four thousand","three thousand","seven thosand","june")); 
		adminSalaryRepository.save(new AdminSalary(0,"suprith","five thousand","four thousand","eigth thosand","july")); 
	}
	

}


