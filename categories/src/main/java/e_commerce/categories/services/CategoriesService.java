package e_commerce.categories.services;

import java.util.List;

import e_commerce.categories.entities.Categories;

public interface CategoriesService {
    Categories get(int id);
    List<Categories> getAll();
    Categories create(Categories categories);
    Categories update(Categories categories, int id);
    void delete(int id);
}
