package br.org.faetectcc2018.repository;

import br.org.faetectcc2018.model.BemCandidato;
import br.org.faetectcc2018.dto.TipoBemCandidatoDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BemCandidatoRepository extends JpaRepository<BemCandidato, Long> {

    @Transactional(readOnly = true)
    @Query("SELECT DISTINCT new br.org.faetectcc2018.dto.TipoBemCandidatoDTO(bc.cdTipoBemCandidato, bc.dsTipoBemCandidato) FROM BemCandidato bc ORDER BY bc.dsTipoBemCandidato")
    List<TipoBemCandidatoDTO> findDistinctByDsTipoBemCandidatoCustom();
}