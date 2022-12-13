package org.generation.italy.demo.controller;

import java.util.List;

import org.generation.italy.demo.pojo.Promo;
import org.generation.italy.demo.service.PromoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/promos")
public class PromoController {

	@Autowired
	private PromoService promoService;
	
	@GetMapping
	public String getPromos(Model model) {
		
		List<Promo> promos = promoService.findPromos();
		model.addAttribute("promos", promos);
		
		return "promos";
	}
	
	@GetMapping("/create")
	public String createPromo() {
		
		return "create-promo";
	}
}
