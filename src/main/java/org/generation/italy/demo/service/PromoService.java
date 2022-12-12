package org.generation.italy.demo.service;

import org.generation.italy.demo.pojo.Promo;
import org.generation.italy.demo.repository.PromoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PromoService {

	@Autowired
	private PromoRepository promoRepo;
	
	public void save(Promo promo) {
		
		promoRepo.save(promo);
	}
}
