package fr.fms;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.fms.dao.CategoryRepository;
import fr.fms.entities.Article;
import fr.fms.entities.Category;
import fr.fms.dao.ArticleRepository;

@SpringBootApplication
public class FmsSpringDemoApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ArticleRepository articleRepository;

	public static void main(String[] args) {
		SpringApplication.run(FmsSpringDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Category tablet = categoryRepository.save(new Category("Tablet"));
//		Category laptop = categoryRepository.save(new Category("Laptop"));
//		Category smartphone = categoryRepository.save(new Category("Smartphone"));
//		
//		 articleRepository.save(new Article("MI10","Xiaomi",850,smartphone));
//		 articleRepository.save(new Article("Ipad","Apple",350,tablet));
//		 articleRepository.save(new Article("GalaxyTab","Samsung",450,tablet));
//		 articleRepository.save(new Article("R510","Asus",6000,laptop));
//		 articleRepository.save(new Article("Corsair II","Corsair",2350,laptop));

		/*
		 * for (Article article : articleRepository.findByBrand("Samsung")) {
		 * System.out.println(article);
		 * 
		 * } for (Article article : articleRepository.findByBrandContains("Samsung")) {
		 * System.out.println(article);
		 * 
		 * } for (Article article :
		 * articleRepository.findByBrandAndPrice("Samsung",250)) {
		 * System.out.println(article);
		 * 
		 * }
		 */

		  for (Article article :
		  articleRepository.findByCategoryId((long)2)) {
		  System.out.println(article);
		  
		  }

	}

}
