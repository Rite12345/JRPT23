package com.dizitive.binding;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class ContactForm {

public ContactForm()
{

}	
	private Integer contactId;
	
	
	private String contactName;

	private String contactEmail;
	
	private String contactNumber;
	

	private String activeSw;
	
	
	private LocalDate createDate;
	
	
	private LocalDate updatedDate;


}
