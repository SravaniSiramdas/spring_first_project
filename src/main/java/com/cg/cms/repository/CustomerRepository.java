package com.cg.cms.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.cg.cms.entities.Customer;

@Service
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	
}
