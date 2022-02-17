package com.example.Insurance.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Insurance.Entity.VehicleOwner;

public interface VehicleOwnerRepository extends CrudRepository <VehicleOwner, Integer>{
	
	VehicleOwner findVehicleOwnerById(Integer id);

}
