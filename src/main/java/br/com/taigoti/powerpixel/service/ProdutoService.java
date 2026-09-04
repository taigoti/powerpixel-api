package br.com.taigoti.powerpixel.service;

import br.com.taigoti.powerpixel.database.model.ProdutoEntity;
import br.com.taigoti.powerpixel.database.repository.IProdutoRepository;
import br.com.taigoti.powerpixel.dto.ProdutoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final IProdutoRepository produtoRepository;

    public List<ProdutoEntity> findAll() {
        return produtoRepository.findAll();
    }

    public void saveProduto(ProdutoDto produtoDto) {
        ProdutoEntity produto = ProdutoEntity.builder()
                .nome(produtoDto.getNome())
                .preco(produtoDto.getPreco())
                .estoque(produtoDto.getEstoque())
                .sku(produtoDto.getSku())
                .build();

        produtoRepository.save(produto);
    }
}
