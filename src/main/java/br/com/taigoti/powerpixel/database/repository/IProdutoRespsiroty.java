package br.com.taigoti.powerpixel.database.repository;

import br.com.taigoti.powerpixel.database.model.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProdutoRespsiroty extends JpaRepository<ProdutoEntity, Long> {

}
