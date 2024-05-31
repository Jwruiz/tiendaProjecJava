package tienda.com.example.tienda.persistencia.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name="productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_productos")
    private Integer idProducto;

    @ManyToOne
    @JoinColumn(name="id_categoria", insertable = false, updatable = false)
    private Categoria categoria;


    private String nombre;

    @Column(name="codigo_barras")
    private String codigoBarras;

    @Column(name="precio_venta")
    private Integer precioVenta;

    @Column(name="cantidad_stock")
    private Integer cantidadStock;

    private Boolean estado;

    @OneToMany(mappedBy = "producto")
    private List<CompraProducto> productos;


}
