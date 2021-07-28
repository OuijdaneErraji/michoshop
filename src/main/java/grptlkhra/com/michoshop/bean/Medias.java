package grptlkhra.com.michoshop.bean;

import javax.persistence.*;

@Entity
public class Medias {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String ref ;
    @ManyToOne
    private Products products;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }
}
