package grptlkhra.com.michoshop.service.impl;


import grptlkhra.com.michoshop.bean.Products;
import grptlkhra.com.michoshop.dao.CategoriesDao;
import grptlkhra.com.michoshop.dao.ProductsDao;
import grptlkhra.com.michoshop.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductsServiceImplmnt implements ProductsService {

    @Autowired
    private ProductsDao productsDao;
    @Autowired
    private CategoriesDao categoriesDao;

    @Override
    public List<Products> findProductsByCategorieName(String name) {
        return productsDao.findProductsByCategorieName(name);
    }

    @Override
    public List<Products> findProductsByName(String name) {
        return productsDao.findProductsByName(name);
    }

    @Override
    public List<Products> findProductsByPrix(Double prix) {
        return productsDao.findProductsByPrix(prix);
    }

    @Transactional
    @Override
    public int deleteProductsByReference(String reference) {
        return productsDao.deleteProductsByReference(reference);
    }

    @Override
    public List<Products> findAll() {
        return productsDao.findAll();
    }

    @Override
    public Products findProductsByReference(String reference) {
        return productsDao.findProductsByReference(reference);
    }

    @Override
    public int save(Products products){
        if (products.getPrix()<=0) {
            return -1;
        }else if (products.getReference()==null || findProductsByReference(products.getReference())!= null){
            return -2;
        }else if (products.getCategorie()== null ||
                this.categoriesDao.findCategoriesByReference(products.getCategorie().getReference())==null ){
            // ila ma kantch l categorie dialo fl base de donnees or null
            return -3;
        }else {
            this.productsDao.save(products);
            return 1;
        }
    }

}
