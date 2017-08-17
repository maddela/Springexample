package com.example.entity;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface EmployeeDAO extends CrudRepository<Customer, Long> {
	
	public Customer findByEmail(String email);

}
