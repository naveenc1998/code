package com.employee_payroll;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.employee_payroll.model.AdminWorkSchedule;
import com.employee_payroll.repository.AdminWorkScheduleRepository;





@EnableAutoConfiguration
@SpringBootApplication
public class SpringBootBackendApplication   implements CommandLineRunner {

@Autowired
@Qualifier("adminWorkScheduleRepository")
private AdminWorkScheduleRepository adminWorkScheduleRepository;


	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
adminWorkScheduleRepository.save(new AdminWorkSchedule(0,"naveen","2009-09-08","nine","night","working"));		
		
	}
}

