package e_commerce.categories.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import e_commerce.categories.entities.Categories;
import e_commerce.categories.repositories.CategoriesRepository;
import e_commerce.categories.services.CategoriesService;

@Service
public class CategoriesServiceImpl implements CategoriesService{

    @Autowired
    private CategoriesRepository categoriesRepository;

    @Override
    public Categories get(int id) {
        Optional<Categories> category = categoriesRepository.findById(id);
        if(category.isPresent()){
            return category.get();
        }
        throw new RuntimeException("Product not found");
    }

    @Override
    public List<Categories> getAll() {
        return categoriesRepository.findAll();
    }

    @Override
    public Categories create(Categories categories) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public Categories update(Categories categories, int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
