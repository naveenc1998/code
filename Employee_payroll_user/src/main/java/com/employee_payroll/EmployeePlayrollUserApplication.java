package com.employee_payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Qualifier;
import com.employee_payroll.model.User;
import com.employee_payroll.repository.UserRepository;


@EnableAutoConfiguration
@SpringBootApplication
public class EmployeePlayrollUserApplication implements CommandLineRunner{

	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeePlayrollUserApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User(0,"rahul","rahul","RAHUL@1","testing","fc"));
		userRepository.save(new User(0,"ramesh","ramesh","ramesh@2","developer","ds"));
		userRepository.save(new User(0,"pavan","pavan","pavan@3","support","ds"));
		userRepository.save(new User(0,"dheeraj","dheeraj","dheeraj@4","cybersecurity","tc"));

	}

}
