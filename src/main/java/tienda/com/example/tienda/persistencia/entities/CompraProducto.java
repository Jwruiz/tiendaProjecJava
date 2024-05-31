package tienda.com.example.tienda.persistencia.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="compras_productos")
public class CompraProducto {

    @EmbeddedId
    private CompraProductoPk id;

    private Integer cantidad;

    private Integer total;

    private Boolean estado;

    @ManyToOne
    @JoinColumn(name="id_producto", insertable = false, updatable = false) //para saber donde ir a buscar en BD
    private Producto producto;

    @ManyToOne
    @JoinColumn(name="id_compra", insertable = false, updatable = false)
    private Compra compra;



}
