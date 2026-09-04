package br.com.taigoti.powerpixel.controller;

import br.com.taigoti.powerpixel.database.model.ProdutoEntity;
import br.com.taigoti.powerpixel.dto.ProdutoDto;
import br.com.taigoti.powerpixel.service.ProdutoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/produtos")
@RequiredArgsConstructor
@Validated
public class ProdutoController {

    private final ProdutoService produtoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProdutoEntity> findAll() {
        return produtoService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveProduto(@Valid @RequestBody ProdutoDto produtoDto) {
        produtoService.saveProduto(produtoDto);
    }
}
