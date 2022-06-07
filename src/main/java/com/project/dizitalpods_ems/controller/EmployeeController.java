package com.project.dizitalpods_ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.dizitalpods_ems.domain.EmployeeDomain;
import com.project.dizitalpods_ems.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@GetMapping("/")
	public List<EmployeeDomain> listAll() {
		return service.listAll();
	}
	
	//to get single data
	@GetMapping("/{id}")
	public EmployeeDomain findOne(@PathVariable long id) {
		return service.get(id);
	}
	@PostMapping("/")
	public void insert(@RequestBody EmployeeDomain ed) 
	{
		service.insert(ed);
	}
	
	@PutMapping("/{id}") 
	public ResponseEntity<?> editJobDetails(@RequestBody EmployeeDomain newDetails, @PathVariable long id)
	{
		try 
		{
			EmployeeDomain existingEmployeeDetails=service.get(id);
			existingEmployeeDetails.setDate(newDetails.getDate());
			existingEmployeeDetails.setClient(newDetails.getClient());
			existingEmployeeDetails.setRole(newDetails.getRole());
			existingEmployeeDetails.setCandidate_name(newDetails.getCandidate_name());
			existingEmployeeDetails.setPrimary_contact(newDetails.getPrimary_contact());
			existingEmployeeDetails.setEmail(newDetails.getEmail());
			existingEmployeeDetails.setTotal_experience(newDetails.getTotal_experience());
			existingEmployeeDetails.setCCTC(newDetails.getCCTC());
			existingEmployeeDetails.setECTC(newDetails.getECTC());
			existingEmployeeDetails.setOfficial_NP(newDetails.getOfficial_NP());
			existingEmployeeDetails.setCurrent_location(newDetails.getCurrent_location());
			existingEmployeeDetails.setStatus(newDetails.getStatus());
			existingEmployeeDetails.setVaccination_status(newDetails.getVaccination_status());
			existingEmployeeDetails.setRecruiter(newDetails.getRecruiter());

			service.insert(existingEmployeeDetails);
			return new ResponseEntity<>(HttpStatus.OK);
		} 
		catch (Exception e) 
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) 
	{
		service.delete(id);
	}
}
