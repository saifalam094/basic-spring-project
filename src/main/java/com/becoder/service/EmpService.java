package com.becoder.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.becoder.entity.Employee;
import com.becoder.repository.EmpRepo;

public class EmpService {
	@Autowired
	private EmpRepo repo;
   public void addEmp( Employee e) {
	   repo.save(e);
   }
}







