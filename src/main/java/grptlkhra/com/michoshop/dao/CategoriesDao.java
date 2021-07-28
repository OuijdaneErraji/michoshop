package grptlkhra.com.michoshop.dao;


import grptlkhra.com.michoshop.bean.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesDao extends JpaRepository<Categories, Long> {

    Categories findCategoriesByName(String name);
    Categories findCategoriesByReference(String reference);

}
