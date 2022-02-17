package com.example.Insurance.Repository;
import org.springframework.data.repository.CrudRepository;

import com.example.Insurance.Entity.Claims;

public interface ClaimsRepository extends CrudRepository <Claims, Integer>{
	
	Claims findClaimsById(Integer id);

}
