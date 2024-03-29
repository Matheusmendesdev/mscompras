package com.api.mscompras.controller;

import com.api.mscompras.model.Pedido;
import com.api.mscompras.service.PedidoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PedidoController {

    private final PedidoService pedidoService;
    @PostMapping
    public ResponseEntity<Pedido> salvar(@RequestBody @Valid Pedido pedido){
        return ResponseEntity.ok(pedidoService.salvar(pedido));
    }
}
