package br.org.faetectcc2018.repositories;

import br.org.faetectcc2018.model.BemCandidato;
import br.org.faetectcc2018.dto.TipoBemCandidato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface BemCandidatoRepository extends JpaRepository<BemCandidato, Long> {

    @Transactional(readOnly = true)
    @Query("SELECT DISTINCT new br.org.faetectcc2018.dto.TipoBemCandidato(bc.cdTipoBemCandidato, bc.dsTipoBemCandidato) FROM BemCandidato bc ORDER BY bc.dsTipoBemCandidato")
    List<TipoBemCandidato> findDistinctByDsTipoBemCandidatoCustom();
}