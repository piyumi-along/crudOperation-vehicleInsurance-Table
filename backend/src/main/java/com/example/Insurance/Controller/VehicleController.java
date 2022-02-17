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

import com.example.Insurance.Entity.Vehicle;
import com.example.Insurance.Repository.VehicleRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class VehicleController {
	
	@Autowired
	VehicleRepository vehicleRepository;
	
	@PostMapping("/add")
	public Vehicle addVehicle(@RequestBody Vehicle newVehicle) {
		return vehicleRepository.save(newVehicle);
	}
	
	@GetMapping("/list")
	public Iterable<Vehicle> getVehicles() {
        return vehicleRepository.findAll();
    }
	
	@PutMapping("/update/{id}")
	public Vehicle updateVehicle(@RequestBody Vehicle updateVehicle, @PathVariable Integer id) {
		Vehicle vehicle=vehicleRepository.findVehicleById(id);
		vehicle.setId(id);
		vehicle.setChassisNo(updateVehicle.getChassisNo());
		vehicle.setEngineNo(updateVehicle.getEngineNo());
		vehicle.setEngineSize(updateVehicle.getEngineSize());
		vehicle.setVehicleModel(updateVehicle.getVehicleModel());
		return vehicleRepository.save(vehicle);
	}
	
	@DeleteMapping("/deleteVehicle/{id}")
	public void deleteVehicle(@PathVariable Integer id) {
		vehicleRepository.deleteById(id);
	}
	
	
	

}
