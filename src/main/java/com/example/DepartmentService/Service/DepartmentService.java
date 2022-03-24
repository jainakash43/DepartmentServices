package com.example.DepartmentService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DepartmentService.Entity.Department;
import com.example.DepartmentService.Repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department save(Department department) {
	     
		return departmentRepository.save(department);
	}
	
	

}
