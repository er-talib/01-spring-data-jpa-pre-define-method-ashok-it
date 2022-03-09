package com.pre.define.method.jpa.reposetory;



import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pre.define.method.jpa.entities.ContactMasterEntity;

public interface ContactMasterReposetory extends CrudRepository<ContactMasterEntity, Integer> {

//  public ContactMasterEntity findByContactName(String name); 
//  public ContactMasterEntity findByContactNameAndContactNumberAndContactId(String name , String number, int id); 
//	 public ContactMasterEntity findByContactNameOrContactNumber(String name , String number); 
//	 public ContactMasterEntity findByContactNameAndContactNumber(String name , String number); 
	 public List<ContactMasterEntity> findByContactIdLessThan(int id); 
	
	

	

}
