package br.com.taigoti.powerpixel.controller;

import br.com.taigoti.powerpixel.database.model.ProdutoEntity;
import br.com.taigoti.powerpixel.dto.ProdutoDto;
import br.com.taigoti.powerpixel.exception.NotFoundException;
import br.com.taigoti.powerpixel.service.ProdutoService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/produtos")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProdutoEntity> findAll() {
        return produtoService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoEntity createProduto(@RequestBody ProdutoDto produtoDto) {
        return produtoService.createProduto(produtoDto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoEntity updateProduto(@PathVariable Integer id,
                                       @RequestBody ProdutoDto produtoDto) throws NotFoundException {
        return produtoService.atualizarProduto(produtoDto, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduto(@PathVariable Integer id) {
        produtoService.removerProduto(id);
    }
}
