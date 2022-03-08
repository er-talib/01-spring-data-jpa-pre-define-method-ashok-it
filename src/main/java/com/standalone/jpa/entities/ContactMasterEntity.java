package com.standalone.jpa.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "contact_master")
public class ContactMasterEntity {

	@Id
	private int contactId ;
	private String contactName ;
	private String contactNumber ;
	private String contactAddress ;
	
	
}
