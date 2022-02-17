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

import com.example.Insurance.Entity.VehicleOwner;
import com.example.Insurance.Repository.VehicleOwnerRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class VehicleOwnerController {
	
	@Autowired
	VehicleOwnerRepository vehicleownerRepository;
	
	@PostMapping("/addVehicleOwner")
	public VehicleOwner addVehicleOwner(@RequestBody VehicleOwner newVehicleOwner) {
		return vehicleownerRepository.save(newVehicleOwner);
	}
	
	@GetMapping("/VehicleOwnerlist")
	public Iterable<VehicleOwner> getVehicleOwners() {
        return vehicleownerRepository.findAll();
    }
	
	@PutMapping("/updateVehicleOwner/{id}")
	public VehicleOwner updateVehicle(@RequestBody VehicleOwner updateVehicleOwner, @PathVariable Integer id) {
		VehicleOwner vehicleowner=vehicleownerRepository.findVehicleOwnerById(id);
		vehicleowner.setId(id);
		vehicleowner.setFirstName(updateVehicleOwner.getFirstName());
		vehicleowner.setLastName(updateVehicleOwner.getLastName());
		vehicleowner.setAddressStreat(updateVehicleOwner.getAddressStreat());;
		vehicleowner.setDateLisned(updateVehicleOwner.getDateLisned());
		return vehicleownerRepository.save(vehicleowner);
	}
	
	@DeleteMapping("/deleteVehicleOwners/{id}")
	public void deleteVehicleOwners(@PathVariable Integer id) {
		vehicleownerRepository.deleteById(id);
	}
	

}
