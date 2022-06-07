package com.project.dizitalpods_ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.dizitalpods_ems.domain.EmployeeDomain;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDomain, Long>{

}
