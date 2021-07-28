package grptlkhra.com.michoshop.service.impl;

import grptlkhra.com.michoshop.bean.Categories;
import grptlkhra.com.michoshop.dao.CategoriesDao;
import grptlkhra.com.michoshop.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesServiceImplemnt implements CategoriesService {


    @Autowired
    private CategoriesDao categoriesDao;

    @Override
    public Categories findCategoriesByName(String name) {
        return categoriesDao.findCategoriesByName(name);
    }

    @Override
    public Categories findCategoriesByReference(String reference) {
        return categoriesDao.findCategoriesByReference(reference);
    }

    @Override
    public List<Categories> findAll() {
        return categoriesDao.findAll();
    }

    @Override
    public int save(Categories categories) {
        if (categories.getName()==null || findCategoriesByName(categories.getName())!=null){
            return -1;
        }else if (categories.getReference()==null|| findCategoriesByReference(categories.getReference())!=null){
            return -2;
        }else {
            categoriesDao.save(categories);
            return 1;
        }
    }
}
