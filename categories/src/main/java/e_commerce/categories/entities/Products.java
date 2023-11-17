package e_commerce.categories.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", length = 100)
    private String name;
    @Column(columnDefinition = "TEXT")
    private String description;
    @Column(name = "image", length = 100)
    private String image;
    @Column(name = "price")
    private double price;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "manufactured_on", length = 100)
    private String manufacturedOn;
    @Column(name = "status")
    private boolean status;

    @Column(name = "category")
    private int categoryId;
    
    
    public Products() {
    }
    
    public Products(int id, String name, String description, String image, double price, int quantity,
            String manufacturedOn, boolean status, int categoryId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.quantity = quantity;
        this.manufacturedOn = manufacturedOn;
        this.status = status;
        this.categoryId = categoryId;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getManufacturedOn() {
        return manufacturedOn;
    }

    public void setManufacturedOn(String manufacturedOn) {
        this.manufacturedOn = manufacturedOn;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
