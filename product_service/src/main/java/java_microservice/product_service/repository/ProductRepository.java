package java_microservice.product_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import java_microservice.product_service.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{
    
}
