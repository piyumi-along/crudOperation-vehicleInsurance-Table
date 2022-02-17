package com.example.Insurance.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Insurance.Entity.Claims;
import com.example.Insurance.Repository.ClaimsRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClaimsController {
	
	@Autowired
	ClaimsRepository claimsrepository;
	
	@PostMapping("/addClaims")
	public Claims addVehicle(@RequestBody Claims newClaims) {
		return claimsrepository.save(newClaims);
	}
	
	@GetMapping("/ClaimsList")
	public Iterable<Claims> getClaims() {
        return claimsrepository.findAll();
    }
	
	@PutMapping("/updateClaims/{id}")
	public Claims updateClaims(@RequestBody Claims updateClaims, @PathVariable Integer id) {
		Claims cliam=claimsrepository.findClaimsById(id);
		cliam.setInsuranceType(updateClaims.getInsuranceType());
		cliam.setDateStart(updateClaims.getDateStart());
		cliam.setDateEnd(updateClaims.getDateEnd());
		cliam.setPayement(updateClaims.getPayement());
		return claimsrepository.save(cliam);
	}
	
	@DeleteMapping("/deleteClaims/{id}")
	public void deleteClaims(@PathVariable Integer id) {
		claimsrepository.deleteById(id);
	}
	
	

}
