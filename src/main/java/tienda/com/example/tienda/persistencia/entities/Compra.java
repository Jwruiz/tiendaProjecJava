package tienda.com.example.tienda.persistencia.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

public class Compra {


    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name="id_compra")
    private Integer idCompra;

    @Column(name="id_cliente")
    private Integer idCliente;

    private LocalDateTime fecha;

    private String medioPago;

    private  String comentario;

    private Boolean estado;

    @OneToMany(mappedBy = "compra")
    private List<CompraProducto> productos;

    @ManyToOne
    @JoinColumn(name="id_cliente", insertable = false, updatable = false)
    private Cliente cliente;


}
