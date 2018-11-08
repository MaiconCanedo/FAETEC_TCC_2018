package br.org.faetectcc2018.repository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
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
}