package br.com.taigoti.powerpixel.service;

import br.com.taigoti.powerpixel.database.model.ProdutoEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {
    private static final List<ProdutoEntity> PRODUTO = List.of(
            ProdutoEntity.builder()
                    .id(1)
                    .nome("Notebook")
                    .preco(4500.0)
                    .quantidade(15)
            .build(),

            ProdutoEntity.builder()
                    .id(2)
                    .nome("Iphone")
                    .preco(3090.9)
                    .quantidade(15)
            .build(),
            ProdutoEntity.builder()
                    .id(3)
                    .nome("Monitor")
                    .preco(750.8)
                    .quantidade(15)
            .build()
    );

    public List<ProdutoEntity> findAll() {
        return new ArrayList<>(PRODUTO);
    }
}
