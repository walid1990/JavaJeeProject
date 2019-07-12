package com.hc.jee.PharmacieProject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PharmacieProjectService {
	
	@Autowired
	PharmacieProjectRepository pharmacieProjectRepository;
	
	
	
	public List<PharmacieInService> getAllPharmacie(){
		return pharmacieProjectRepository.findAll();
		
	}
	
	public PharmacieInService getPharmacie (int id) {
		return pharmacieProjectRepository.findById(id);
	}
	
	public void addPharmacie (PharmacieInService pharmacie) {
		pharmacieProjectRepository.save(pharmacie);
	}
	
	public void deletePharmacie (int id) {
		pharmacieProjectRepository.deleteById(id);
	}
	
	public void updatePharmacie (PharmacieInService pharmacie) {
		pharmacieProjectRepository.save(pharmacie);
	}

}
