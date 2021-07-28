package grptlkhra.com.michoshop.ws;


import grptlkhra.com.michoshop.bean.Products;
import grptlkhra.com.michoshop.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("mishoShop/products")
public class ProductsWS {

    @Autowired
    private ProductsService productsService;

    @GetMapping("/categories/{name}")
    public List<Products> findProductsByCategorieName(@PathVariable String name) {
        return productsService.findProductsByCategorieName(name);
    }

    @GetMapping("/name/{name}")
    public List<Products> findProductsByName(@PathVariable String name) {
        return productsService.findProductsByName(name);
    }

    @GetMapping("/prix/{prix}")
    public List<Products> findProductsByPrix(@PathVariable Double prix) {
        return productsService.findProductsByPrix(prix);
    }

    @DeleteMapping("/ref/{reference}")
    public int deleteProductsByReference(@PathVariable String reference) {
        return productsService.deleteProductsByReference(reference);
    }

    @GetMapping("/")
    public List<Products> findAll() {
        return productsService.findAll();
    }

    @GetMapping("/reference/{reference}")
    public Products findProductsByReference(@PathVariable String reference) {
        return productsService.findProductsByReference(reference);
    }

    @PostMapping("/")
    public int save(@RequestBody Products products) {
        return productsService.save(products);
    }
}
