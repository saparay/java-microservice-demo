package e_commerce.products.services;

import java.util.List;

import e_commerce.products.entities.Products;

public interface ProductService {
    Products getProductById(int id);
    List<Products> getProducts();
    Products createProduct(Products product);
    Products updateProduct(int id, Products product);
    void deleteProduct(int id);
}
