package id.code.springbootmysql.Controller;

import id.code.springbootmysql.model.Product;
import id.code.springbootmysql.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "rest/product")
public class ProductResource {

    @Autowired
    ProductsRepository productsRepository;

    @GetMapping(value = "/all")
    public List<Product> getAll(){
        return productsRepository.findAll();
    }

    @PostMapping(value = "/load")
    public List<Product> presist(@RequestBody Product product){
       productsRepository.save(product);
       return  productsRepository.findAll();
    }

}
