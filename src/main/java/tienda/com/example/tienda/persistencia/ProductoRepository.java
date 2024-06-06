package tienda.com.example.tienda.persistencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tienda.com.example.tienda.dominio.Product;
import tienda.com.example.tienda.dominio.repositorio.ProductRepository;
import tienda.com.example.tienda.persistencia.crud.ProductoCrudRepository;
import tienda.com.example.tienda.persistencia.entities.Producto;
import tienda.com.example.tienda.persistencia.mappers.ProductMapper;

import java.util.List;

@Repository
public class ProductoRepository implements ProductRepository {

    @Autowired
    private ProductoCrudRepository productoCrudRepository;
    @Autowired
    private ProductMapper mapper;


    @Autowired
    public ProductoRepository(ProductoCrudRepository productoCrudRepository, ProductMapper mapper) {
        this.productoCrudRepository = productoCrudRepository;
        this.mapper = mapper;
    }

    @Override
    public List<Product> getAll(){

       List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
       return mapper.toProducts(productos);
    }

    public void deleteProducto(int id){
        productoCrudRepository.deleteById(id);
    }

    @Override
    public List<Product> findByCategory(int id){

        List<Producto> productos = (List<Producto>) productoCrudRepository.findByIdCategoria(id);
        return mapper.toProducts(productos);
    }

    @Override
    public void deleteById(int id) {
        productoCrudRepository.deleteById(id);

    }

    @Override
    public List<Product> getScarseProduct(int productId) {
        List<Producto> productos = (List<Producto>) productoCrudRepository.findByCantidadStockLessThan(productId);
        return mapper.toProducts(productos);
    }

    @Override
    public Product save(Product product) {
        Producto producto = mapper.producto(product);
        return mapper.toProduct(productoCrudRepository.save(producto));
    }


    }

