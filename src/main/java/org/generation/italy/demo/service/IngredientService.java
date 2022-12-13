package org.generation.italy.demo.service;

import java.util.List;

import org.generation.italy.demo.pojo.Ingredient;
import org.generation.italy.demo.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientService {

	@Autowired
	private IngredientRepository ingRepo;
	
	
	public void saveIngredient(Ingredient ingredient) {
		
		ingRepo.save(ingredient);
	}
	
	public List<Ingredient> findAll() {
		
		return ingRepo.findAll();
	}
}