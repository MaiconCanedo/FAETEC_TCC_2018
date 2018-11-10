package br.org.faetectcc2018.repository;

import br.org.faetectcc2018.dto.TipoBemDTO;
import br.org.faetectcc2018.model.BemCandidato;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@ActiveProfiles("dev")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class BemCandidatoRepositoryTest {

    @Autowired
    private BemCandidatoRepository bemCandidatoRepository;

    @Test
    public void findDistinctByDsTipoBemCandidatoCustom_CodigoPreenchidoDescricaoInformada() {
        final String descricao = "Veículo Automotor";
        final BemCandidato bemCandidato = new BemCandidato.Builder().comTipoBemCodigo(1).comTipoBemDescricao(descricao).buiild();
        bemCandidatoRepository.save(bemCandidato);

        final List<TipoBemDTO> tipoBemDTOList = bemCandidatoRepository.findDistinctByDsTipoBemCandidatoCustom();

        assertFalse("Nenhum objeto encontrado", tipoBemDTOList.isEmpty());
        assertEquals("Numero de itens não bate", 1, tipoBemDTOList.size());
        assertEquals("Objeto encontrado não bate com o que foi salvo", descricao, tipoBemDTOList.get(0).getDescricao());
        assertEquals("Objeto encontrado não bate com o que foi salvo", Integer.valueOf(1), tipoBemDTOList.get(0).getCodigo());
    }

    @Test
    public void findDistinctByDsTipoBemCandidatoCustom_CodigoNaoPreenchidoDescricaoInformada() {
        final String descricao = "Veículo Automotor";
        final BemCandidato bemCandidato = new BemCandidato.Builder().comTipoBemDescricao(descricao).buiild();
        bemCandidatoRepository.save(bemCandidato);

        final List<TipoBemDTO> tipoBemDTOList = bemCandidatoRepository.findDistinctByDsTipoBemCandidatoCustom();

        assertTrue("Objeto encontrado", tipoBemDTOList.isEmpty());
    }

    @Test
    public void findDistinctByDsTipoBemCandidatoCustom_CodigoPreenchidoDescricaoNaoInformada() {
        final String descricao = "Veículo Automotor";
        final BemCandidato bemCandidato = new BemCandidato.Builder().comTipoBemCodigo(1).buiild();
        bemCandidatoRepository.save(bemCandidato);

        final List<TipoBemDTO> tipoBemDTOList = bemCandidatoRepository.findDistinctByDsTipoBemCandidatoCustom();

        assertTrue("Objeto encontrado", tipoBemDTOList.isEmpty());
    }

    @Test
    public void findDistinctByDsTipoBemCandidatoCustom_CodigoNaoPreenchidoDescricaoNaoInformada() {
        final String descricao = "Veículo Automotor";
        final BemCandidato bemCandidato = new BemCandidato.Builder().buiild();
        bemCandidatoRepository.save(bemCandidato);

        final List<TipoBemDTO> tipoBemDTOList = bemCandidatoRepository.findDistinctByDsTipoBemCandidatoCustom();

        assertTrue("Objeto encontrado mesmo com dados nulos", tipoBemDTOList.isEmpty());
    }
}