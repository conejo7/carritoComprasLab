package com.unir.carrito.carritocompras.data;

import com.unir.carrito.carritocompras.model.pojo.TipoProducto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TipoProductoRepository extends JpaRepository<TipoProducto,Long> {

    List<TipoProducto> findTipoProductoByTipoDescripcion(String descripcion);

}
