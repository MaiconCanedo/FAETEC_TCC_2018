package br.org.faetectcc2018.repository;

import br.org.faetectcc2018.model.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatoRepository extends JpaRepository<Candidato, Long> {
}