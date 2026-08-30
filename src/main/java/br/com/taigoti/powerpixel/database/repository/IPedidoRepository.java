package br.com.taigoti.powerpixel.database.repository;

import br.com.taigoti.powerpixel.database.model.PedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPedidoRepository extends JpaRepository<PedidoEntity, Long> {

}
