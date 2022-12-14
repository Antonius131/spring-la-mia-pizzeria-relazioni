package org.generation.italy.demo.service;

import java.util.List;
import java.util.Optional;

import org.generation.italy.demo.pojo.Pizza;
import org.generation.italy.demo.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaService {

	@Autowired
	private PizzaRepository pizzaRepo;
	
	public void save(Pizza pizza) {
		
		pizzaRepo.save(pizza);
	}
	
	public List<Pizza> findAll() {
		
		return pizzaRepo.findAll();
	}
	
	public Optional<Pizza> getPizzaById(int id) {
		return pizzaRepo.findById(id);
	}
	
	public void deletePizzaById(int id) {
		pizzaRepo.deleteById(id);
	}
	
	public List<Pizza> findByName(String name) {
		
		return pizzaRepo.findByNameContainingIgnoreCase(name);
	}
}
