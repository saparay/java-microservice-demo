package e_commerce.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import e_commerce.products.entities.Products;

public interface ProductRepository extends JpaRepository<Products, Integer>{
    
}
