package br.com.taigoti.powerpixel.service;

import br.com.taigoti.powerpixel.database.model.PedidoEntity;
import br.com.taigoti.powerpixel.database.repository.IPedidoRepository;
import br.com.taigoti.powerpixel.dto.PedidoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PedidoService {

    private final IPedidoRepository pedidoRepository;

    public List<PedidoEntity> findAll() {
        return pedidoRepository.findAll();
    }

    public void save(PedidoDto pedidoDto) {
        PedidoEntity pedido = PedidoEntity.builder()
                .usuario(pedidoDto.getUsuario())
                .produtos(pedidoDto.getProdutos())
                .dataCriacao(pedidoDto.getDataCriacao())
                .build();

        pedidoRepository.save(pedido);
    }
}
