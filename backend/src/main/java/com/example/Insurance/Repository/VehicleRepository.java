package com.example.Insurance.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Insurance.Entity.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, Integer>{
	
	Vehicle findVehicleById(Integer id);

}
