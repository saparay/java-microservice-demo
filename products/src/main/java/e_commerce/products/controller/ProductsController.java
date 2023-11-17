package e_commerce.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import e_commerce.products.entities.Products;
import e_commerce.products.services.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
    
    @Autowired
    private ProductService productsService;

    @GetMapping
    public ResponseEntity<List<Products>> getProducts() {
        return ResponseEntity.status(HttpStatus.OK).body(productsService.getProducts());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Products> getProductById(@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.OK).body(productsService.getProductById(id));
    }

    @PostMapping
    public ResponseEntity<Products> createProduct(@RequestBody Products product) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productsService.createProduct(product));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Products> updateProduct(@PathVariable int id, @RequestBody Products product) {
        return ResponseEntity.status(HttpStatus.OK).body(productsService.updateProduct(id, product));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable int id) {
        productsService.deleteProduct(id);
        return ResponseEntity.status(HttpStatus.OK).body("Product deleted successfully");
    }

}

