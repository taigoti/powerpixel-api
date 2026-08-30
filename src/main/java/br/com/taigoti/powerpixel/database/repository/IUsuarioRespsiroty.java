package br.com.taigoti.powerpixel.database.repository;

import br.com.taigoti.powerpixel.database.model.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRespsiroty extends JpaRepository<UsuarioEntity, Long> {

}
