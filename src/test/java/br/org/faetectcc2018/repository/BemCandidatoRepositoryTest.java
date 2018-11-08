package br.org.faetectcc2018.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class BemCandidatoRepositoryTest {

    @Autowired
    private BemCandidatoRepository bemCandidatoRepository;

    @Test
    public void findDistinctByDsTipoBemCandidatoCustom() {

    }
}