package com.example.EmployeeService;

import com.example.EmployeeService.models.Department;
import com.example.EmployeeService.models.Employee;
import com.example.EmployeeService.repositories.DepartmentRepository;
import com.example.EmployeeService.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeServiceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployee(){
		Employee employee = new Employee("Keanu", "Reeves", 234762);
		employeeRepository.save(employee);
	}

	@Test
	public void canCreateDept(){
		Department department = new Department("Finance");
		departmentRepository.save(department);
	}

}
