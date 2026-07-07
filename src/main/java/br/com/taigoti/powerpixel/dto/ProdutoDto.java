package br.com.taigoti.powerpixel.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ProdutoDto {

    private String nome;
    private Double preco;
    private Integer quantidade;
}
