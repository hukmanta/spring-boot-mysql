package id.code.springbootmysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

    //menggunakan javax persistance Annotation untuk membuat ddl
    @Id
    @GeneratedValue
    @Column(name = "PRODUCT_ID", nullable = false)
    private Integer id;
    @Column(name = "NAME", nullable = false)
     private String name;
    @Column(name = "PRICE", nullable = false)
     private double price;
    @Column(name = "Description", nullable = false)
     private String Description;

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
