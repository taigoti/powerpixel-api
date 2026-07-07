package br.com.taigoti.powerpixel.service;

import br.com.taigoti.powerpixel.database.model.ProdutoEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {
    private final List<ProdutoEntity> PRODUTO = List.of(
            ProdutoEntity.builder()
                    .id(1)
                    .nome("Notebook")
                    .preco(45.3)
                    .quantidade(15)
            .build(),

            ProdutoEntity.builder()
                    .id(2)
                    .nome("Notebook")
                    .preco(45.3)
                    .quantidade(15)
            .build(),
            ProdutoEntity.builder()
                    .id(2)
                    .nome("Notebook")
                    .preco(45.3)
                    .quantidade(15)
            .build()
    );

    public List<ProdutoEntity> findAll() {
        return PRODUTO;
    }
}
