package e_commerce.categories.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import e_commerce.categories.entities.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Integer>{
    
}
