package com.hc.jee.PharmacieProject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PharmacieProjectRepository extends JpaRepository<PharmacieInService, Integer> {
	public PharmacieInService findById(int id);

}
