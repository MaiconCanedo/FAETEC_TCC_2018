package br.org.faetectcc2018.service;

import br.org.faetectcc2018.model.Candidato;
import br.org.faetectcc2018.repository.CandidatoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class CandidatoServiceTest {

    @Autowired
    private CandidatoService candidatoService;
    @Autowired
    private CandidatoRepository candidatoRepository;

    @Test
    public void find_IdCorreto() {
        final String nome = "João Dória";
        Candidato candidato = new Candidato.Builder().comNome(nome).comSiglaUf("SP").comCargoCodigo(3).comCargoDescricao("GOVERNADOR").build();
        candidatoRepository.save(candidato);

        Optional<Candidato> candidatoOptional = candidatoService.find(1L);

        assertTrue("Candidato nao encontrado", candidatoOptional.isPresent());
        assertEquals("Candidato encontrado nao corresponde", nome, candidatoOptional.get().getNmCandidato());
    }

    @Test
    public void find_IdIncorreto() {
        final String nome = "João Dória";
        Candidato candidato = new Candidato.Builder().comNome(nome).comSiglaUf("SP").comCargoCodigo(3).comCargoDescricao("GOVERNADOR").build();
        candidatoRepository.save(candidato);

        Optional<Candidato> candidatoOptional = candidatoService.find(2L);

        assertFalse("Candidato encontrado", candidatoOptional.isPresent());
    }

    @Test
    public void findByCargoAndUf_CargoCorretoUfCorreta() {
        final String nome = "João Dória";
        final String uf = "SP";
        final Integer cargo = 3;
        Candidato candidato = new Candidato.Builder().comNome(nome).comSiglaUf(uf).comCargoCodigo(cargo).comCargoDescricao("GOVERNADOR").build();
        candidatoRepository.save(candidato);

        Optional<Page<Candidato>> candidatoOptional = candidatoService.findByCargoAndUf(uf, cargo, 0, 20, "id", "ASC");

        assertTrue("Candidato nao encontrado", candidatoOptional.isPresent());
        assertEquals("Quantidade de candidatos incoerente", 1, candidatoOptional.get().getContent().size());
        assertEquals("Candidato encontrado nao corresponde", nome, candidatoOptional.get().getContent().get(0).getNmCandidato());
    }

    @Test
    public void findByCargoAndUf_CargoCorretoUfCorretaComVariosDados() {
        final String uf = "SP";
        final Integer cargo = 3;
        final String nome1 = "Ana Maria da Silva Silveira";
        final String nome2 = "João Dória";
        Candidato candidato1 = new Candidato.Builder().comNome(nome2).comSiglaUf(uf).comCargoCodigo(cargo).comCargoDescricao("GOVERNADOR").build();
        Candidato candidato2 = new Candidato.Builder().comNome(nome1).comSiglaUf(uf).comCargoCodigo(cargo).comCargoDescricao("GOVERNADOR").build();
        Candidato candidato3 = new Candidato.Builder().comNome("José Henrique Neto").comSiglaUf(uf).comCargoCodigo(6).comCargoDescricao("DEPUTADO FEDERAL").build();
        Candidato candidato4 = new Candidato.Builder().comNome("Maria Eduarda Marques").comSiglaUf("RJ").comCargoCodigo(cargo).comCargoDescricao("GOVERNADOR").build();
        candidatoRepository.saveAll(Arrays.asList(candidato1, candidato2, candidato3, candidato4));

        Optional<Page<Candidato>> candidatoOptional = candidatoService.findByCargoAndUf(uf, cargo, 0, 20, "nmCandidato", "ASC");

        assertTrue("Candidato nao encontrado", candidatoOptional.isPresent());
        assertEquals("Quantidade de candidatos incoerente", 2, candidatoOptional.get().getContent().size());
        assertEquals("Deveria está em ordem alfabética", nome1, candidatoOptional.get().getContent().get(0).getNmCandidato());
        assertEquals("Deveria está em ordem alfabética", nome2, candidatoOptional.get().getContent().get(1).getNmCandidato());
    }

    @Test
    public void findByCargoAndUf_CargoIncorretoUfCorreta() {
        final String nome = "João Dória";
        final String uf = "SP";
        final Integer cargo = 3;
        Candidato candidato = new Candidato.Builder().comNome(nome).comSiglaUf(uf).comCargoCodigo(cargo).comCargoDescricao("GOVERNADOR").build();
        candidatoRepository.save(candidato);

        Optional<Page<Candidato>> candidatoOptional = candidatoService.findByCargoAndUf(uf, 0, 0, 20, "id", "ASC");

        assertFalse("Candidato nao encontrado", candidatoOptional.isPresent());
    }

    @Test
    public void findByCargoAndUf_CargoICorretoUfIncorreta() {
        final String nome = "João Dória";
        final String uf = "SP";
        final Integer cargo = 3;
        Candidato candidato = new Candidato.Builder().comNome(nome).comSiglaUf(uf).comCargoCodigo(cargo).comCargoDescricao("GOVERNADOR").build();
        candidatoRepository.save(candidato);

        Optional<Page<Candidato>> candidatoOptional = candidatoService.findByCargoAndUf("ER", cargo, 0, 20, "id", "ASC");

        assertFalse("Candidato nao encontrado", candidatoOptional.isPresent());
    }

    @Test
    public void findEstados_ComDado() {
        Candidato candidato1 = new Candidato.Builder().comSiglaUf("RJ").build();
        candidatoRepository.save(candidato1);

        Optional<List<String>> estados = candidatoService.findEstados();

        assertTrue("Nenhum estado encontrado", estados.isPresent());
        assertEquals("Tamanho da lista incoerente", 1, estados.get().size());
        assertEquals("Estado encontrado é diferente do esperado", "RJ", estados.get().get(0));
    }

    @Test
    public void findEstados_ComVariosDados() {
        Candidato candidato1 = new Candidato.Builder().comSiglaUf("RJ").build();
        Candidato candidato2 = new Candidato.Builder().comSiglaUf("RJ").build();
        Candidato candidato3 = new Candidato.Builder().comSiglaUf("SP").build();
        Candidato candidato4 = new Candidato.Builder().comSiglaUf("SP").build();
        candidatoRepository.saveAll(Arrays.asList(candidato1, candidato2, candidato3, candidato4));

        Optional<List<String>> estados = candidatoService.findEstados();

        assertTrue("Nenhum estado encontrado", estados.isPresent());
        assertEquals("Tamanho da lista incoerente", 2, estados.get().size());
        assertEquals("Deveria está em ordem alfabética", "RJ", estados.get().get(0));
        assertEquals("Deveria está em ordem alfabética", "SP", estados.get().get(1));
    }

    @Test
    public void findEstados_SemDados() {
        Optional<List<String>> estados = candidatoService.findEstados();

        assertFalse("Estado encontrado, mesmo sem dados", estados.isPresent());
    }

    @Test
    public void findEstados_ComDadosNulos() {
        List<Candidato> candidatoList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            candidatoList.add(new Candidato.Builder().comNome("Zé Ninguém").comSiglaUf(null).build());
        }
        candidatoRepository.saveAll(candidatoList);

        Optional<List<String>> estados = candidatoService.findEstados();

        assertFalse("Objeto não deveria está presente", estados.isPresent());
    }
}