package br.org.faetectcc2018.repository;

import br.org.faetectcc2018.model.BemCandidato;
import br.org.faetectcc2018.dto.TipoBemDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BemCandidatoRepository extends JpaRepository<BemCandidato, Long> {

    @Transactional(readOnly = true)
    @Query("SELECT DISTINCT new br.org.faetectcc2018.dto.TipoBemDTO(bem.cdTipoBemCandidato, bem.dsTipoBemCandidato) FROM BemCandidato bem WHERE bem.cdTipoBemCandidato IS NOT NULL AND bem.dsTipoBemCandidato IS NOT NULL ORDER BY bem.dsTipoBemCandidato")
    List<TipoBemDTO> findDistinctByDsTipoBemCandidatoCustom();
}