package br.org.faetectcc2018.service;

import br.org.faetectcc2018.dto.TipoBemDTO;
import br.org.faetectcc2018.model.BemCandidato;
import br.org.faetectcc2018.repository.BemCandidatoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class BemCandidatoServiceTest {

    @Autowired
    private BemCandidatoService bemCandidatoService;
    @Autowired
    private BemCandidatoRepository bemCandidatoRepository;

    @Test
    public void findAllTipoDeBem_ComDado() {
        final String descricao = "Apartamento Triplex";
        final Integer codigo = 13;
        final BemCandidato bemCandidato = new BemCandidato.Builder().comTipoBemDescricao(descricao).comTipoBemCodigo(codigo).buiild();
        bemCandidatoRepository.save(bemCandidato);

        final Optional<List<TipoBemDTO>> tipoBemDTOList = bemCandidatoService.findAllTipoDeBem();

        assertTrue("Objeto não presente", tipoBemDTOList.isPresent());
        assertEquals("Quantidade de itens diferente do esperado", 1, tipoBemDTOList.get().size());
        assertEquals("O objeto encontra não era o esperado", descricao, tipoBemDTOList.get().get(0).getDescricao());
        assertEquals("O objeto encontra não era o esperado", codigo, tipoBemDTOList.get().get(0).getCodigo());
    }

    @Test
    public void findAllTipoDeBem_ComDados() {
        final String descricao = "Apartamento Triplex";
        final String descricao1 = "Veículo automotor";
        final Integer codigo = 13;
        final Integer codigo1 = 10;
        final BemCandidato bemCandidato1 = new BemCandidato.Builder().comTipoBemDescricao(descricao1).comTipoBemCodigo(codigo1).buiild();
        final BemCandidato bemCandidato = new BemCandidato.Builder().comTipoBemDescricao(descricao).comTipoBemCodigo(codigo).buiild();
        final BemCandidato bemCandidato2 = new BemCandidato.Builder().buiild();
        final BemCandidato bemCandidato3 = new BemCandidato.Builder().buiild();
        bemCandidatoRepository.saveAll(Arrays.asList(bemCandidato, bemCandidato1, bemCandidato2, bemCandidato3));

        final Optional<List<TipoBemDTO>> tipoBemDTOList = bemCandidatoService.findAllTipoDeBem();

        assertTrue("Objeto não presente", tipoBemDTOList.isPresent());
        assertEquals("Quantidade de itens diferente do esperado", 2, tipoBemDTOList.get().size());
        assertEquals("Deveria está em ordem alfabética", descricao, tipoBemDTOList.get().get(0).getDescricao());
        assertEquals("Deveria está em ordem alfabética", descricao1, tipoBemDTOList.get().get(1).getDescricao());
    }
}