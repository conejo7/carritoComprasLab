package com.unir.carrito.carritocompras.model.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Data
@Entity
@Table(name = "tipo_producto", schema = "carrito_db", catalog = "")
public class TipoProducto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TIPO_ID")
    private Long tipoId;
    @Basic
    @Column(name = "TIPO_DESCRIPCION")
    private String tipoDescripcion;
    @Basic
    @Column(name = "TIPO_ESTADO")
    private Boolean tipoEstado;


}
