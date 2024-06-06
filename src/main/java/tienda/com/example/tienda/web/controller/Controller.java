package tienda.com.example.tienda.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tienda.com.example.tienda.dominio.Product;
import tienda.com.example.tienda.dominio.servicios.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private ProductService productService;
    @GetMapping("/products")
    public List<Product> getAll(){
        return productService.getAll();
}
}
