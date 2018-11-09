package br.org.faetectcc2018.repository;

import br.org.faetectcc2018.dto.CandidatoDTO;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class CandidatoRepositoryTest {

    @Autowired
    private CandidatoRepository candidatoRepository;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findBySgUfDistinct() {

        candidatoRepository.findBySgUfAndDistinctByCdCargo("RJ").forEach(System.out::println);
    }

    @Test
    public void findEstados() {
        candidatoRepository.findEstados().forEach(System.out::println);
    }

    @Test
    public void findBySgUfAndCdCargoOrderByNmCandidato() {
        candidatoRepository.findBySgUfAndCdCargo("RJ", 6, PageRequest.of(0, 20, Sort.Direction.ASC, "nmCandidato"))
                .map(CandidatoDTO::new).forEach(System.out::println);
    }
}