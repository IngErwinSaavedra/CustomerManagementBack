package com.acl.spring.security.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acl.spring.security.crud.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
