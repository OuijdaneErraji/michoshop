package grptlkhra.com.michoshop.ws;


import grptlkhra.com.michoshop.bean.Categories;
import grptlkhra.com.michoshop.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("mishoShop/categories")
public class CategoriesWS {

    @Autowired
    private CategoriesService categoriesService;

    @GetMapping("/name/{name}")
    public Categories findCategoriesByName(@PathVariable String name) {
        return categoriesService.findCategoriesByName(name);
    }

    @GetMapping("/ref/{reference}")
    public Categories findCategoriesByReference(@PathVariable String reference) {
        return categoriesService.findCategoriesByReference(reference);
    }

    @GetMapping("/")
    public List<Categories> findAll() {
        return categoriesService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Categories categories) {
        return categoriesService.save(categories);
    }
}
