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

    public CandidatoDTO() {
    }

    public CandidatoDTO(Candidato candidato) {
        id = candidato.getId();
        sequencialCandidato = candidato.getSqCandidato();
        nome = candidato.getNmCandidato();
        numero = candidato.getNrCandidato();
        codigoCargo = candidato.getCdCargo();
        descricaoCargo = candidato.getDsCargo();
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

    @Override
    public String toString() {
        return new StringJoiner(", ", CandidatoDTO.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("sequencialCandidato='" + sequencialCandidato + "'")
                .add("nome='" + nome + "'")
                .add("numero='" + numero + "'")
                .add("codigoCargo=" + codigoCargo)
                .add("descricaoCargo='" + descricaoCargo + "'")
                .toString();
    }
}