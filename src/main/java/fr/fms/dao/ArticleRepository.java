package fr.fms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.fms.entities.Article;

public interface ArticleRepository extends JpaRepository<Article,Long>{
public List<Article> findByBrand(String brand);
public List<Article> findByBrandContains(String brand);
public List<Article> findByBrandAndPrice(String brand,double price);
//public List<Article> findByBrandAndPriceGreatherThan(String brand,double price);
//public List<Article> findByBrandLikeAndPriceGreatherThan(String brand,double price);
public List<Article> findByCategoryId(Long categoryId);
}
