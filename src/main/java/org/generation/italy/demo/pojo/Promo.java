package org.generation.italy.demo.pojo;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;


@Entity
@Table
public class Promo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull(message = "Inserisci il nome della Promo")
	@Column
	private String title;
	
	@NotNull
	@Column
	private LocalDate startDate;
	
	@NotNull
	@Column
	private LocalDate endDate;
	
	
	@OneToMany(mappedBy = "promo", cascade = CascadeType.REMOVE)
	private List<Pizza> pizzas;
	
	public Promo(){}
	public Promo(String title, LocalDate startDate, LocalDate endDate) {
		
		setTitle(title);
		setStartDate(startDate);
		setEndDate(endDate);
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}		
	
	public List<Pizza> getPizzas() {
		
		return pizzas;
	}

	public void setPizzas(List<Pizza> pizzas) {
		this.pizzas = pizzas;
	}
	
	@Override
	public String toString() {
		
		return getId() 
				+ " - " 
				+ getTitle() 
				+ " - " 
				+ getStartDate() 
				+ " - " 
				+ getEndDate();
	}
}
