package br.org.faetectcc2018.repositories;

import br.org.faetectcc2018.model.Candidato;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CandidatoRepository extends PagingAndSortingRepository<Candidato, Long> {

}
