package com.necture.laundryPoints.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.necture.laundryPoints.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {

}