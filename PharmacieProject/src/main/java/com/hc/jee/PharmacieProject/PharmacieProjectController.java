package com.hc.jee.PharmacieProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class PharmacieProjectController {
	
	@Autowired
	PharmacieProjectService pharmacieProjectService; 
	
	@GetMapping("/pharmacies")
	public List<PharmacieInService> getAll(){
		return pharmacieProjectService.getAllPharmacie();
	}
	
	@GetMapping("/pharmacies/id/{id}")
	public PharmacieInService getPharmacie(@PathVariable int id) {
		return pharmacieProjectService.getPharmacie(id);
	}
	
	@PostMapping("/pharmacies")
	public void addPharmacie(@RequestBody PharmacieInService pharmacie) {
		pharmacieProjectService.addPharmacie(pharmacie);
	}
	
	@PutMapping("/pharmacies")
	public void updatePharmacie(@RequestBody PharmacieInService pharmacie) {
		pharmacieProjectService.updatePharmacie(pharmacie);
	}
	
	@DeleteMapping("/pharmacies/id/{id}")
	public void deletePharmacie(@PathVariable int id) {
		pharmacieProjectService.deletePharmacie(id);
	}
	

}
