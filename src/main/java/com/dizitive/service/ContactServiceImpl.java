package com.dizitive.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dizitive.binding.ContactForm;
import com.dizitive.entity.Contact;
import com.dizitive.repository.ContactRepository;
@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepo;
	@Override
	public String saveContact(ContactForm form) {
		System.out.println("contatform="+form);
		Contact entity=new Contact();
		BeanUtils.copyProperties(form, entity);
		System.out.println("contact="+entity);
	     entity= contactRepo.save(entity);
	   if(entity.getContactId()!=null)
	   {
		   return "success";
	   }
	     
	
		return "failed";
	
		
	}

	@Override
	public List<ContactForm> viewContacts() {
		List<ContactForm> dataList=new ArrayList();
		List<Contact> findAll = contactRepo.findAll();
		 for(Contact entity: findAll)
		 {
			 ContactForm form=new ContactForm();
			 BeanUtils.copyProperties(entity, form);
			 dataList.add(form);
		 }
		return dataList;  
	}

	@Override
	public ContactForm editContact(Integer contactId) {
		Optional<Contact> findById = contactRepo.findById(contactId);
		if(findById.isPresent())
		{
			Contact entity = findById.get();
			ContactForm form=new ContactForm();
		BeanUtils.copyProperties(entity, form);
		return form;
		}
		return null;
	}

	@Override
	public List<ContactForm> deleteContact(Integer contactId) {
  contactRepo.deleteById(contactId);
		
		return viewContacts();
	}

}
