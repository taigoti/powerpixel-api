package br.com.taigoti.powerpixel.service;

import br.com.taigoti.powerpixel.database.model.ProdutoEntity;
import br.com.taigoti.powerpixel.database.repository.IProdutoRepository;
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
}
