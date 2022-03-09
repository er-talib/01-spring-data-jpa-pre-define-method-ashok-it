package com.pre.define.method.jpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pre.define.method.jpa.entities.ContactMasterEntity;
import com.pre.define.method.jpa.reposetory.ContactMasterReposetory;

@SpringBootApplication
public class SpringDataJpaAshokItApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaAshokItApplication.class, args);
		ContactMasterReposetory bean = context.getBean(ContactMasterReposetory.class);

// ################## Insert single and multiple entity object in database #################### 

		/*
		 * ContactMasterEntity entity1 = new ContactMasterEntity();
		 * entity1.setContactId(128); entity1.setContactName("Abdul khaliqe ");
		 * entity1.setContactNumber("9322124439"); entity1.setContactAddress("Hapur");
		 * 
		 * ContactMasterEntity entity2 = new ContactMasterEntity();
		 * entity2.setContactId(127); entity2.setContactName("Abhishak Goyal ");
		 * entity2.setContactNumber("8583929149");
		 * entity2.setContactAddress("Ghaziabad");
		 * 
		 * ContactMasterEntity entity3 = new ContactMasterEntity();
		 * entity3.setContactId(129); entity3.setContactName("Tarun ");
		 * entity3.setContactNumber("9912345290"); entity3.setContactAddress("Delhi");
		 * 
		 * List<ContactMasterEntity> listOfEntities = new ArrayList<>();
		 * listOfEntities.add(entity1); listOfEntities.add(entity2);
		 * listOfEntities.add(entity3);
		 * 
		 * bean.save(entity); save single entity object in table
		 * bean.saveAll(listOfEntities); // save multiple entity object at a time
		 * 
		 */

//####################### Retrive one , multiple and all entity object from database ##################

		// Retrive all entity object from database

//		List<ContactMasterEntity> findAllRecords = (List<ContactMasterEntity>) bean.findAll();

//		  for(Object all : findAllRecords)  //this is my logiv / simple logic
//		  { 
//		  System.out.println(all); 
//		 } 

//   using lambda expression 
		/*
		 * findAllRecords.forEach(allRecords -> { System.out.println(allRecords); });
		 */

//	    Retrive one record from database 
		/*
		 * ContactMasterEntity contactMasterEntity = new ContactMasterEntity();
		 * 
		 * Optional<ContactMasterEntity> byId = bean.findById(123);
		 * if(byId.isPresent()){ ContactMasterEntity entity = byId.get();
		 * System.out.println(entity); }else{
		 * System.out.println("Object is not available"); }
		 */

//		ContactMasterEntity masterEntity = new ContactMasterEntity(); this is not used this time

		/*
		 * List<Integer> list = new ArrayList<>(); list.add(123); list.add(127);
		 * list.add(128);
		 * 
		 * Iterable<ContactMasterEntity> allById = bean.findAllById(list);
		 * 
		 * // for(ContactMasterEntity all : allById) { simple logic / my logic //
		 * System.out.println(all); // }
		 * 
		 * // using lambda expression allById.forEach(records -> {
		 * System.out.println(records); });
		 */

//	    delete operation  in db 
		/*
		 * ContactMasterEntity contEntity = new ContactMasterEntity();
		 * bean.deleteById(123);boolean
		 */

		// count record how many record are available in db
//		long count = bean.count();
//		System.out.println(count);

		// record is exist or not in database
		/*
		 * boolean existsById = bean.existsById(127); if (existsById) {
		 * System.out.println("Record is exist is db");
		 * System.out.println(bean.findById(128)); } else {
		 * System.out.println("Record is not exist is db "); }
		 * 
		 */

///  Custom finder method 

		/*
		 * 1 ContactMasterEntity byContactName =
		 * bean.findByContactNameOrContactNumber("Tarun ", null);
		 * System.out.println(byContactName);
		 */

		/*
		 * 2 ContactMasterEntity byContactName =
		 * bean.findByContactNameAndContactNumber("Atul kevat ", "9823457531");
		 * System.out.println(byContactName);
		 */

		/*
		 * 3 ContactMasterEntity andContactNumber =
		 * bean.findByContactNameAndContactNumberAndContactId("Abdul khaliqe "
		 * ,"9322124439",128); System.out.println(andContactNumber);
		 */

		
		   List<ContactMasterEntity> idLessThan = bean.findByContactIdLessThan(128);
		  // for(Object rec : idLessThan) { // System.out.println(rec); // } for for  loop 
		  
		  idLessThan.forEach(records -> { System.out.println(records); });
		 

		
		context.close();
	}

}
