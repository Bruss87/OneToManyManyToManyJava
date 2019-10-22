package com.example.EmployeeService;

import com.example.EmployeeService.models.Department;
import com.example.EmployeeService.models.Employee;
import com.example.EmployeeService.models.Project;
import com.example.EmployeeService.repositories.DepartmentRepository;
import com.example.EmployeeService.repositories.EmployeeRepository;
import com.example.EmployeeService.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeServiceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployeeAndDepartment(){
		Department department = new Department("Finance");
		departmentRepository.save(department);

		Employee employee = new Employee("Keanu", "Reeves", 234762, department);
		employeeRepository.save(employee);
	}

	@Test
	public void canAddToProject(){
		Department department = new Department("Finance");
		departmentRepository.save(department);

		Employee employee = new Employee("Keanu", "Reeves", 234762, department);
		employeeRepository.save(employee);

		Project project1 = new Project("P1", 5);
		projectRepository.save(project1);

		project1.addEmployee(employee);
		projectRepository.save(project1);


	}

}
