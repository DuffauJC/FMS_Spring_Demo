package fr.fms.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Article implements Serializable{


	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	private String description;
	private String brand;
	private double price;
	
	@ManyToOne
	private Category category;
	
	public Article() {
		super();
	}
	/**
	 * @param id
	 * @param description
	 * @param brand
	 * @param price
	 */
	public Article( String brand, String description, double price,Category category) {
		super();
		this.description = description;
		this.brand = brand;
		this.price = price;
		this.category=category;
	}


	/**
	 * @param id
	 * @param description
	 * @param brand
	 * @param price
	 */
	public Article(Long id, String brand,String description, double price,Category category) {
		super();
		this.id = id;
		this.description = description;
		this.brand = brand;
		this.price = price;
		this.category=category;
	}


	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}


	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", description=" + description + ", brand=" + brand + ", price=" + price
				+ ", category=" + category + "]";
	}



	
	
	
	
}
