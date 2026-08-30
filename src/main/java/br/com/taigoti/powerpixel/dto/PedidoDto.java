package br.com.taigoti.powerpixel.dto;

import br.com.taigoti.powerpixel.database.model.ItensPedidoEntity;
import br.com.taigoti.powerpixel.database.model.UsuarioEntity;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class PedidoDto {

    private UsuarioEntity usuario;
    private List<ItensPedidoEntity> produtos;
    private LocalDateTime dataCriacao;

}
