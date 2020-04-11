package br.com.bandtec.jpa.repositorios;

import br.com.bandtec.jpa.entidades.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
