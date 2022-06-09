package fr.fms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.fms.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {

	// exo 1.6 Ajouter des moyens pour afficher les noms des catégories classés par ordre 
	//croissant puis décroissant
	
	@Query("select name from Category order by name asc")
	public List<Category> showCategoryAsc();
	
	public List<Category> findAllByOrderByNameAsc();
	
	@Query("select name from Category order by name desc")
	public List<Category> showCategoryDesc();
	
	public List<Category> findAllByOrderByNameDesc();
	
}
