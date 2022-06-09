package fr.fms.dao;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.fms.entities.Article;


public interface ArticleRepository extends JpaRepository<Article, Long> {

	// exo 1.1

	public List<Article> findByBrand(String brand);

	public List<Article> findByBrandContains(String brand);

	public List<Article> findByBrandAndPrice(String brand, double price);

	public List<Article> findByBrandAndPriceGreaterThan(String brand, double price);

	@Query("select A from Article A where A.brand like %:x% and A.price > :y")
	public List<Article> searchArticles(@Param("x") String kw, @Param("y") double price);

	public List<Article> findByCategoryId(Long categoryId);

	// exo 1.2 Trouver 2 moyens d’afficher sur la console un article en base
	
	public Optional<Article> findById(Long Id);

	public Optional<Article> findByDescription(String description);
	
	// exo 1.3 Ajouter une méthode qui permet de renvoyer tous les articles contenants 
	//telle description et telle marque.
	
	public List<Article> findByDescriptionAndBrand(String description,String brand);
	
	// exo 1.4 Ajouter une méthode qui permet de supprimer un article à partir de l’id

	public void deleteById(Long Id);
	
	// exo 1.5 Ajouter une méthode qui permet de mettre à jour un article à partir de l’id
	
	public default Article getArticleById(long Id)   
	{  
	return findById(Id).get();  
	}  
	
	public default void update(Article article, long Id)   
	{  
	save(article);  
	}  
	

	
	
}
