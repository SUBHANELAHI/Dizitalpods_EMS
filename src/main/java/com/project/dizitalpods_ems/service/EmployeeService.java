package com.project.dizitalpods_ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.project.dizitalpods_ems.domain.EmployeeDomain;
import com.project.dizitalpods_ems.repository.EmployeeRepository;

@Service
public class EmployeeService {
@Autowired
private EmployeeRepository repo;

public List<EmployeeDomain>listAll()
{
	return repo.findAll();
}


public void insert(EmployeeDomain details) {
	repo.save(details);
}

public EmployeeDomain get(long id) {
	
	return repo.findById(id).get();
	
}

public void delete(long id) 
{
	repo.deleteById(id);
}
}
