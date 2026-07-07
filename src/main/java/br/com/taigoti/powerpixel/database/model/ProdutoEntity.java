package br.com.taigoti.powerpixel.database.model;

import jdk.jshell.Snippet;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ProdutoEntity {

    private Integer id;
    private String nome;
    private Double preco;
    private Integer quantidade;
}
