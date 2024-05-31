package tienda.com.example.tienda.persistencia;

import org.springframework.stereotype.Repository;
import tienda.com.example.tienda.persistencia.crud.ProductoCrudRepository;
import tienda.com.example.tienda.persistencia.entities.Producto;

import java.util.List;

@Repository
public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public void deleteProducto(int id){
        productoCrudRepository.deleteById(id);
    }

    public Producto findByCategory(int id){
        return productoCrudRepository.findByIdCategoria(id);
    }

    public List<Producto> stockBajo(int cantidad){
        return (List<Producto>) productoCrudRepository.findByCantidadStockLessThan(cantidad);
    }

    public Producto createProducto(Producto producto){
        return productoCrudRepository.save(producto);
    }
}
