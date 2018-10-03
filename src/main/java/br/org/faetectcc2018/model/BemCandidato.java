package br.org.faetectcc2018.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "bens_candidatos")
public class BemCandidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer anoEleicao;

    @Column(length = 70)
    private String descricaoEleicao;

    @Column(length = 2)
    private String siglaUf;

    @Column(length = 11)
    private String sqCandidato;

    private Integer cdTipoBemCandidato;

    @Column(length = 100)
    private String dsTipoBemCandidato;

    private String detalheBem;

    @Column(length = 10, precision = 2)
    private Double valorBem;

    public BemCandidato() {}

    @Override
    public String toString() {
        return "BemCandidato{" +
                "id=" + id +
                ", anoEleicao='" + anoEleicao + '\'' +
                ", descricaoEleicao='" + descricaoEleicao + '\'' +
                ", siglaUf='" + siglaUf + '\'' +
                ", sqCandidato='" + sqCandidato + '\'' +
                ", cdTipoBemCandidato='" + cdTipoBemCandidato + '\'' +
                ", dsTipoBemCandidato='" + dsTipoBemCandidato + '\'' +
                ", detalheBem='" + detalheBem + '\'' +
                ", valorBem='" + valorBem + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Objects.equals(id, ((BemCandidato)o).id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAnoEleicao() {
        return anoEleicao;
    }

    public void setAnoEleicao(Integer anoEleicao) {
        this.anoEleicao = anoEleicao;
    }

    public String getDescricaoEleicao() {
        return descricaoEleicao;
    }

    public void setDescricaoEleicao(String descricaoEleicao) {
        this.descricaoEleicao = descricaoEleicao;
    }

    public String getSiglaUf() {
        return siglaUf;
    }

    public void setSiglaUf(String siglaUf) {
        this.siglaUf = siglaUf;
    }

    public String getSqCandidato() {
        return sqCandidato;
    }

    public void setSqCandidato(String sqCandidato) {
        this.sqCandidato = sqCandidato;
    }

    public Integer getCdTipoBemCandidato() {
        return cdTipoBemCandidato;
    }

    public void setCdTipoBemCandidato(Integer cdTipoBemCandidato) {
        this.cdTipoBemCandidato = cdTipoBemCandidato;
    }

    public String getDsTipoBemCandidato() {
        return dsTipoBemCandidato;
    }

    public void setDsTipoBemCandidato(String dsTipoBemCandidato) {
        this.dsTipoBemCandidato = dsTipoBemCandidato;
    }

    public String getDetalheBem() {
        return detalheBem;
    }

    public void setDetalheBem(String detalheBem) {
        this.detalheBem = detalheBem;
    }

    public Double getValorBem() {
        return valorBem;
    }

    public void setValorBem(Double valorBem) {
        this.valorBem = valorBem;
    }
}