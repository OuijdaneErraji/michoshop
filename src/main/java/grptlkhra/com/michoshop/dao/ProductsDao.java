package grptlkhra.com.michoshop.dao;


import grptlkhra.com.michoshop.bean.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsDao extends JpaRepository<Products, Long> {

     List<Products> findProductsByCategorieName(String name);
     List<Products> findProductsByName(String name);
     List<Products> findProductsByPrix(Double prix);
     Products findProductsByReference(String reference);

     int deleteProductsByReference(String reference);
}
