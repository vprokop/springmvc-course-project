package com.infiniteskills.data.repositories;

import java.util.List;

/*
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
*/
import org.springframework.data.repository.CrudRepository;

import com.infiniteskills.data.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

	/*
	Page<Product> findByDescriptionContaining(String description, Pageable pageable);
	
	@Query("select p from Product p where p.attributes[?1] = ?2")
	List<Product> findByAttributeAndValue(String attribute, String value);
	*/
	
	void delete(Product product);
	
	List<Product> findAll();
	
	Product findOne(Long id);
	
	@SuppressWarnings("unchecked")
	Product save(Product product);
}
