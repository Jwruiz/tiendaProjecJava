package tienda.com.example.tienda.dominio.repositorio;

import tienda.com.example.tienda.dominio.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> getAll();
    List<Product> findByCategory (int categoryId);
    void deleteById(int id);
    List<Product> getScarseProduct(int productId);

    Product save (Product product);


}
