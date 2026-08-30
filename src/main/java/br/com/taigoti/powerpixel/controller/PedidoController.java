package br.com.taigoti.powerpixel.controller;

import br.com.taigoti.powerpixel.database.model.PedidoEntity;
import br.com.taigoti.powerpixel.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/pedidos")
@RequiredArgsConstructor
public class PedidoController {
    private final PedidoService pedidoService;

    @GetMapping
    public List<PedidoEntity> findAll() {
        return pedidoService.findAll();
    }
}
