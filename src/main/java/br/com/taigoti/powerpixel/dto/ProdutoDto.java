package br.com.taigoti.powerpixel.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDto {

    @NotBlank
    public String nome;
    @NotNull
    public BigDecimal preco;
    @NotNull
    public Integer estoque;
    @NotBlank
    public String sku;
}
