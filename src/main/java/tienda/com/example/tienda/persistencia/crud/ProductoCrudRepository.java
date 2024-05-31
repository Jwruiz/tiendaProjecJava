package tienda.com.example.tienda.persistencia.crud;

import org.springframework.data.repository.CrudRepository;
import tienda.com.example.tienda.persistencia.entities.Producto;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    Producto findByIdCategoria(int id);


    Producto findByCantidadStockLessThan(int cantidad);
}
