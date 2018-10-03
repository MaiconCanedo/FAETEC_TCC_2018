package br.org.faetectcc2018.repositories;

import br.org.faetectcc2018.model.Votacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VotacaoRepository extends JpaRepository<Votacao, Long> {
}