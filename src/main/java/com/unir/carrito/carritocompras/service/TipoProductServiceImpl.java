package com.unir.carrito.carritocompras.service;

import com.unir.carrito.carritocompras.data.TipoProductoRepository;
import com.unir.carrito.carritocompras.model.pojo.TipoProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoProductServiceImpl implements TipoProductoService{

    @Autowired
    private TipoProductoRepository tipoProductoRepository;

    @Override
    public List<TipoProducto> getTipoProducts() {
        List<TipoProducto> tipoProductos = tipoProductoRepository.findAll();
        return tipoProductos.isEmpty() ? null : tipoProductos;
    }
}
