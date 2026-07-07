package br.com.taigoti.powerpixel.service;

import br.com.taigoti.powerpixel.database.model.ProdutoEntity;
import br.com.taigoti.powerpixel.dto.ProdutoDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {
    private static final List<ProdutoEntity> PRODUTOS = new ArrayList<>();

    static {
        PRODUTOS.add(ProdutoEntity.builder()
                .id(1)
                .nome("Notebook")
                .preco(4500.0)
                .quantidade(15)
        .build());

        PRODUTOS.add(ProdutoEntity.builder()
                        .id(2)
                        .nome("Iphone")
                        .preco(3090.9)
                        .quantidade(15)
        .build());

        PRODUTOS.add(ProdutoEntity.builder()
                        .id(3)
                        .nome("Monitor")
                        .preco(750.8)
                        .quantidade(15)
        .build());
    }

    public List<ProdutoEntity> findAll() {
        return new ArrayList<>(PRODUTOS);
    }

    public ProdutoEntity createProduto(ProdutoDto produtoDto) {

        Integer identificador = PRODUTOS.stream()
                .mapToInt(ProdutoEntity::getId)
                .max()
                .orElse(0) + 1;

        ProdutoEntity novoProduto = ProdutoEntity.builder()
                .id(identificador)
                .nome(produtoDto.getNome())
                .preco(produtoDto.getPreco())
                .quantidade(produtoDto.getQuantidade())
        .build();

        PRODUTOS.add(novoProduto);
        return novoProduto;
    }
}
