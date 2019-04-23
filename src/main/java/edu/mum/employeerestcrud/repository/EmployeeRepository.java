package edu.mum.employeerestcrud.repository;

import edu.mum.employeerestcrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
}
