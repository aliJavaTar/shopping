package entity;

import entity.base.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "products")
public class Product extends BaseEntity<Long> implements Serializable {
    private static final String PRODUCT_NAME = "product_name";
    private static final String BRAND = "brand";
    private static final String PRICE = "price";
    private static final String TITLE = "title";
    private static final String DESCRIPTION = "description";
    private static final String QUANTITY = "quantity";
    private static final String HOURS = "making_hours";

    @Column(name = PRODUCT_NAME)
    private String productName;
    @Column(name = BRAND)
    public String brand;
    @Column(name = PRICE)
    private int price;
    @Column(name = TITLE)
    private String title;
    @Column(name = DESCRIPTION)
    private String description;
    @Column(name = QUANTITY)
    private int quantityInStock;
    @Column(name = HOURS)
    private Timestamp makingHours;
    @OneToOne
    private Category category;

    public Product() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public Timestamp getMakingHours() {
        return makingHours;
    }

    public void setMakingHours(Timestamp makingHours) {
        this.makingHours = makingHours;
    }

}
