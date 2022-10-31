
package com.employee_payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employee_payroll.model.AdminAttendance;
import com.employee_payroll.repository.AdminAttendanceRepository;


@SpringBootApplication
public class SpringBootBackendApplication implements CommandLineRunner {
	
	@Autowired
	@Qualifier("adminAttendanceRepository")
	private AdminAttendanceRepository adminAttendanceRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		adminAttendanceRepository.save(new AdminAttendance(0,"naveen","rocky@gmail.com","2009-09-08","present"));
		
	}
	
	}




