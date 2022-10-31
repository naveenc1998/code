
package com.employee_payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employee_payroll.model.AdminLeave;
import com.employee_payroll.repository.AdminLeaveRepository;

@EnableAutoConfiguration
@SpringBootApplication
public class SpringBootBackendApplication implements CommandLineRunner {
@Autowired
@Qualifier("adminLeaveRepository")
private AdminLeaveRepository adminLeaveRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
adminLeaveRepository.save(new AdminLeave(1, "1999-09-08","1999-09-09", "op", "wedding", "absent"));
		
	}
}

