package com.dizitive.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dizitive.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact,Integer> {
	

}
