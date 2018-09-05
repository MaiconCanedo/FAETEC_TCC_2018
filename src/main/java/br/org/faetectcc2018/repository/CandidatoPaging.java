package br.org.faetectcc2018.repository;

import br.org.faetectcc2018.modelo.Candidato;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CandidatoPaging extends PagingAndSortingRepository<Candidato, Long> {

}
