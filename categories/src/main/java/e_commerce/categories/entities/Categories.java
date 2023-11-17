package e_commerce.categories.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Categories {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @OneToMany(targetEntity = Products.class, cascade = CascadeType.ALL)
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
