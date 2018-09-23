package br.org.faetectcc2018.repositories;

import br.org.faetectcc2018.model.BemCandidato;
import br.org.faetectcc2018.model.dto.TipoBemCandidato;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface BemCandidatoRepository extends PagingAndSortingRepository<BemCandidato, Long> {

    @Query("SELECT DISTINCT new br.org.faetectcc2018.model.dto.TipoBemCandidato(bc.cdTipoBemCandidato, bc.dsTipoBemCandidato) FROM BemCandidato bc ORDER BY bc.cdTipoBemCandidato")
    List<TipoBemCandidato> findDistinctByDsTipoBemCandidatoCustom();
}
