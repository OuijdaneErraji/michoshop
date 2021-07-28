package grptlkhra.com.michoshop.service;


import grptlkhra.com.michoshop.bean.Categories;

import java.util.List;

public interface CategoriesService {

    Categories findCategoriesByName(String name);
    Categories findCategoriesByReference(String reference);
    List<Categories> findAll();
    int save(Categories categories);
}
