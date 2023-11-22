package java_microservice.product_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import java_microservice.product_service.dto.ProductRequest;
import java_microservice.product_service.dto.ProductResponse;
import java_microservice.product_service.model.Product;
import java_microservice.product_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    // public ProductService(ProductRepository productRepository) {
    // this.productRepository = productRepository;
    // }

    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
            productRepository.save(product);
            log.info("Product {} is saved!", product.getId());
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRepository.findAll();
        List<ProductResponse> productResponse = products.stream().map(product -> mapToProductResponse(product)).toList(); 
        return productResponse;
    }

    private ProductResponse mapToProductResponse(Product product){
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
