package com.example.EmployeeService.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="employees")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="emp_no")
    private int empNo;

    @JsonIgnoreProperties("employees")
    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;

    @JsonIgnoreProperties(value="employees")
    @ManyToMany(mappedBy = "employees")
    @OnDelete(action= OnDeleteAction.CASCADE)
    private List <Project> projects;


    public Employee(String firstName, String lastName, int empNo, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empNo = empNo;
        this.department = department;
        this.projects = new ArrayList <>();
    }

    public Employee(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public Department getDepartment(){
        return department;
    }

    public void setDepartment(Department department){
        this.department = department;
    }
}
