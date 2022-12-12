package org.generation.italy.demo;

import org.generation.italy.demo.pojo.Drink;
import org.generation.italy.demo.pojo.Pizza;
import org.generation.italy.demo.service.DrinkService;
import org.generation.italy.demo.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLaMiaPizzeriaCrudApplication implements CommandLineRunner{
	
	@Autowired
	private PizzaService pizzaService;
	@Autowired
	private DrinkService drinkService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringLaMiaPizzeriaCrudApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Pizza p1 = new Pizza("Margherita", "buona", 5);
		Pizza p2 = new Pizza("Diavola", "buonissima", 7);
		Pizza p3 = new Pizza("Capricciosa", "non buona", 8);
		
		pizzaService.save(p1);
		pizzaService.save(p2);
		pizzaService.save(p3);
		
		
		Drink d1 = new Drink("Gin tonic", "e vabbè..", 4);
		Drink d2 = new Drink("Gin lemon", "drink dei bimbi", 2);
		Drink d3 = new Drink("Negroni sbagliato", "e sì..", 5);
		
		drinkService.saveDrinks(d1);
		drinkService.saveDrinks(d2);
		drinkService.saveDrinks(d3);
	}
}