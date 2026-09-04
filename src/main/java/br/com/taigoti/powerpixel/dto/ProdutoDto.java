package br.com.taigoti.powerpixel.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDto {

    public String nome;
    public BigDecimal preco;
    public Integer estoque;
    public String sku;
}
