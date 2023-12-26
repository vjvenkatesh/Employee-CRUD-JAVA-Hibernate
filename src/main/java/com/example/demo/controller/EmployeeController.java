package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.model.*;
import com.example.demo.repository.EmployeeRepository;
@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
 
	@Autowired
	private EmployeeRepository employeeRepository;
	@GetMapping("/employee")
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
		}
	//create data
	@PostMapping("/post")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
	@RequestMapping(value="/student",method=RequestMethod.GET)
	@Autowired
	public List<StudentList> Getstudent() {
		List<StudentList> std=new ArrayList<>();
		std.add(new StudentList("hello","hello#ysajjns",1));
		std.add(new StudentList("het","he#ysajjns",2));
		std.add(new StudentList("hello","h#ysajjns",3));
		std.add(new StudentList("hello","hens",4));
		return std;
				
	}
}
