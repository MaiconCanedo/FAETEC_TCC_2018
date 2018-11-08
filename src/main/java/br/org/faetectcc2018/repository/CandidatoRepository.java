package br.org.faetectcc2018.repository;

import br.org.faetectcc2018.dto.CargoDTO;
import br.org.faetectcc2018.model.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CandidatoRepository extends JpaRepository<Candidato, Long> {

    @Query(value = "SELECT DISTINCT candidato.sgUf FROM Candidato candidato")
    List<String> findEstados();

    @Query(value = "SELECT DISTINCT new br.org.faetectcc2018.dto.CargoDTO(candidato.cdCargo, candidato.dsCargo) FROM Candidato candidato WHERE candidato.sgUf = :sgUf ORDER BY candidato.dsCargo")
    List<CargoDTO> findBySgUfAndDistinctByCdCargo(@Param(value = "sgUf") String sgUf);
}