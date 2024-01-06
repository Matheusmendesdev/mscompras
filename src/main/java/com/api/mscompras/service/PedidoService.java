package com.api.mscompras.service;

import com.api.mscompras.model.Pedido;
import com.api.mscompras.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PedidoService {

    private final PedidoRepository repository;

    public Pedido salvar(Pedido pedido){
        return repository.save(pedido);
    }
}
