package com.dizitive.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dizitive.binding.ContactForm;
import com.dizitive.service.ContactService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
//@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	private ContactService service;
	
	@PostMapping("/save")
	public String saveContact(@RequestBody ContactForm form)
	{
		System.out.println("form="+form);
		String status = service.saveContact(form);
		return status;
	}
}
