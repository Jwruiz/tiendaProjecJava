package tienda.com.example.tienda.dominio.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import tienda.com.example.tienda.dominio.Product;
import tienda.com.example.tienda.dominio.repositorio.ProductRepository;

import java.util.List;

public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll(){
        return productRepository.getAll();
    }

    public List<Product> findByCategory(int categoryId){
        return productRepository.findByCategory(categoryId);
    }
}
