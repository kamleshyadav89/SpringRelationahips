package com.itvedant.relationships.one_one;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = PassportProjection.class)
public interface PasswordRepository extends JpaRepository<Passport, Integer> {

	
	//one to one 
	// post man steps
	//n1 . add person -post
	//add passport- post
	//personid 5 ,passport id 2
	//mapping
	//loc 
	// put
	//

}
