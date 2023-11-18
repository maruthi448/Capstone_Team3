package com.example.springbootmongodbatlas.controller;

import com.example.springbootmongodbatlas.entity.Product;
import com.example.springbootmongodbatlas.repo.SearchRepository;
import com.example.springbootmongodbatlas.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins= "http://localhost:3000")
@Controller
@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    SearchRepository srepo;

    @GetMapping("/all")
    @CrossOrigin
    public List<Product> getProducts() {
       return productService.getProducts();
    }

    @GetMapping("/getByID/{id}")
    @CrossOrigin
    public Product get (@PathVariable int id)
    {
        return productService.getProductById(id);
    }

    @GetMapping("/getByText/{text}")
    @CrossOrigin
    public List<Product> search(@PathVariable String text)
    {
        return srepo.findByText(text);
    }

    @PostMapping("/insert")
    public Product insert(@RequestBody Product product){
        return  productService.addProduct(product);
    }

    @PutMapping("/update/{id}")
   public Product update(@PathVariable int id,@RequestBody Product product ){
       return productService.updateProduct(id,product);
    }

    @DeleteMapping("/delete/{id}")
    public Product delete(@PathVariable int id ){

        return  productService.deleteProduct(id);
    }
}
