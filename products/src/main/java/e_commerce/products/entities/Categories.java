package e_commerce.products.entities;

import java.util.List;

public class Categories {
    
    private int id;
    
    private String name;
    
    private List<Products> products;
    public Categories() {
    }
    public Categories(int id, String name, List<Products> products) {
        this.id = id;
        this.name = name;
        this.products = products;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Products> getProducts() {
        return products;
    }
    public void setProducts(List<Products> products) {
        this.products = products;
    }
    
}

