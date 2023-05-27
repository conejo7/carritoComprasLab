package com.unir.carrito.carritocompras.controller;

import com.unir.carrito.carritocompras.model.pojo.TipoProducto;
import com.unir.carrito.carritocompras.service.TipoProductoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@Slf4j
public class TipoProductoController {

    private final TipoProductoService service;

    @GetMapping("/tiposProductos")
    public ResponseEntity<List<TipoProducto>> getProducts() {

        //log.info("headers: {}", headers);
        List<TipoProducto> products = service.getTipoProducts();

        if (products != null) {
            return ResponseEntity.ok(products);
        } else {
            return ResponseEntity.ok(Collections.emptyList());
        }
    }


    @GetMapping("/test")
    public String hola() {
        //logger.info("Funcionando");
        return "test2";
    }
}
