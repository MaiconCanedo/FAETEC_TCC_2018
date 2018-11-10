package br.org.faetectcc2018.dto;

import br.org.faetectcc2018.model.Candidato;

import java.util.StringJoiner;

public class CandidatoDTO {

    private Long id;
    private String sequencialCandidato;
    private String nome;
    private String numero;
    private Integer codigoCargo;
    private String descricaoCargo;
    private String siglaUf;
    private String cpf;

    public CandidatoDTO() {
    }

    public CandidatoDTO(Candidato candidato) {
        id = candidato.getId();
        sequencialCandidato = candidato.getSqCandidato();
        nome = candidato.getNmCandidato();
        numero = candidato.getNrCandidato();
        codigoCargo = candidato.getCdCargo();
        descricaoCargo = candidato.getDsCargo();
        siglaUf = candidato.getSgUf();
        cpf = candidato.getNrCpfCandidato();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSequencialCandidato() {
        return sequencialCandidato;
    }

    public void setSequencialCandidato(String sequencialCandidato) {
        this.sequencialCandidato = sequencialCandidato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Integer getCodigoCargo() {
        return codigoCargo;
    }

    public void setCodigoCargo(Integer codigoCargo) {
        this.codigoCargo = codigoCargo;
    }

    public String getDescricaoCargo() {
        return descricaoCargo;
    }

    public void setDescricaoCargo(String descricaoCargo) {
        this.descricaoCargo = descricaoCargo;
    }

    public String getSiglaUf() {
        return siglaUf;
    }

    public CandidatoDTO setSiglaUf(String siglaUf) {
        this.siglaUf = siglaUf;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public CandidatoDTO setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }
}