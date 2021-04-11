package com.department.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.department.service.entity.Department;
import com.department.service.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@PostMapping("/")
	public Department createDepartment(@RequestBody Department department) {
		log.info("conroller method of department service");
		return departmentRepository.save(department);
	}
	
	@GetMapping("/{id}")
	public Department getDepartment(@PathVariable Long id) {
		log.info("conroller method of department service");
		return departmentRepository.findByDepartmentId(id);
	}
}
