package grptlkhra.com.michoshop.service;


import grptlkhra.com.michoshop.bean.Products;

import java.util.List;

public interface ProductsService {

    public List<Products> findProductsByCategorieName(String name);
    public List<Products> findProductsByName(String name);
    public List<Products> findProductsByPrix(Double prix);
    public int deleteProductsByReference(String reference);
    public List<Products> findAll();
    public Products findProductsByReference(String reference);
    public int save(Products products);

}
