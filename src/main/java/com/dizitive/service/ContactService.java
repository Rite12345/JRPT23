package com.dizitive.service;

import java.util.List;

import com.dizitive.binding.ContactForm;

public interface ContactService {
	
	public String saveContact(ContactForm form);
	
	List<ContactForm> viewContacts();
	
	public ContactForm editContact(Integer contactId);
    
	public List<ContactForm> deleteContact(Integer contactId);
   
}
