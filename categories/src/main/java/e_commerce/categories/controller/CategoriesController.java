package e_commerce.categories.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import e_commerce.categories.entities.Categories;
import e_commerce.categories.services.CategoriesService;

@RestController
@RequestMapping(path = "/api/categories")
public class CategoriesController {

    @Autowired
    private CategoriesService categoriesService;

    @GetMapping
    public ResponseEntity<List<Categories>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(categoriesService.getAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Categories> get(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(categoriesService.get(id));
    }
    
}
