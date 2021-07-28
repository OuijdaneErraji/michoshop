package grptlkhra.com.michoshop.bean;

import javax.persistence.*;

@Entity
public class Products {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String reference;
    private String description;
    private Double prix;
    @ManyToOne
    private Categories categorie ;
    private String[] dimensions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Categories getCategorie() {
        return categorie;
    }

    public void setCategorie(Categories categorie) {
        this.categorie = categorie;
    }

    public String[] getDimensions() {
        return dimensions;
    }

    public void setDimensions(String[] dimensions) {
        this.dimensions = dimensions;
    }
}
