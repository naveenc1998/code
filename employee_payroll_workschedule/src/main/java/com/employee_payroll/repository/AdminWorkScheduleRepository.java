package com.employee_payroll.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee_payroll.model.AdminWorkSchedule;

@Repository
public interface AdminWorkScheduleRepository extends JpaRepository<AdminWorkSchedule, Long> {

	List<AdminWorkSchedule> findAll();

	Optional<AdminWorkSchedule> findById(long empid);

	AdminWorkSchedule save(AdminWorkSchedule adminWorkSchedule);

	void deleteById(long empid);

}