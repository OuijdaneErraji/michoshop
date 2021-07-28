package grptlkhra.com.michoshop.bean;

import javax.persistence.*;

@Entity
public class Orders {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String orderRef;
    @ManyToOne
    private Products products;
    @ManyToOne
    private Client client;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOrderRef() {
        return orderRef;
    }

    public void setOrderRef(String orderRef) {
        this.orderRef = orderRef;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
