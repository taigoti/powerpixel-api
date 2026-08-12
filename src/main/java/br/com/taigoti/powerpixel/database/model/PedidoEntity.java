package br.com.taigoti.powerpixel.database.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "pedidos")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class PedidoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @JoinColumn(name = "produtos")
    private List<ProdutoEntity> produtos;

    @OneToOne
    @JoinColumn(name = "usuarios")
    private UsuarioEntity usuario;

    @CreatedDate
    @Column(name = "data_criacao",  nullable = false, updatable = false)
    private LocalDateTime dataCriacao;

}
