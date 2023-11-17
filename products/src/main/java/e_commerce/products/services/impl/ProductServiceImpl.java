package e_commerce.products.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import e_commerce.products.entities.Products;
import e_commerce.products.repository.ProductRepository;
import e_commerce.products.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productsRepository;

    @Override
    public Products getProductById(int id) {
        Optional<Products> product = productsRepository.findById(id);
        if (product.isPresent()) {
            return product.get();
        } else {
            throw new RuntimeException("Product not found");
        }
    }

    @Override
    public List<Products> getProducts() {
        return productsRepository.findAll();
    }

    @Override
    public Products createProduct(Products product) {
        return productsRepository.save(product);
    }

    @Override
    public Products updateProduct(int id, Products product) {
        Optional<Products> product_obj = productsRepository.findById(id);
        if (product_obj.isPresent()) {
            Products product_existing_obj = product_obj.get();
            product_existing_obj.setName(product.getName());
            product_existing_obj.setPrice(product.getPrice());
            product_existing_obj.setDescription(product.getDescription());
            product_existing_obj.setImage(product.getImage());
            product_existing_obj.setQuantity(product.getQuantity());
            product_existing_obj.setManufacturedOn(product.getManufacturedOn());
            product_existing_obj.setStatus(product.getStatus());
            Products product_obj_updated = productsRepository.save(product_existing_obj);
            return product_obj_updated;
        } else {
            throw new RuntimeException("Product not found");
        }
    }

    @Override
    public void deleteProduct(int id) {
        Optional<Products> product = productsRepository.findById(id);
        if (product.isPresent()) {
            productsRepository.deleteById(id);
        } else {
            throw new RuntimeException("Product not found");
        }
    }
}
