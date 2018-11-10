package br.org.faetectcc2018.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;
import java.util.StringJoiner;

@Entity
@Table(name = "bem_candidato")
public class BemCandidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bem_candidato")
    private Long id;
    private LocalDate dtGeracao;
    private LocalTime hhGeracao;
    private Integer anoEleicao;
    private Integer cdTipoEleicao;
    private String nmTipoEleicao;
    private Integer cdEleicao;
    private String dsEleicao;
    private LocalDate dtEleicao;
    private String sgUf;
    private String sgUe;
    private String nmUe;
    private String sqCandidato;
    private String nrOrdemCandidato;
    private Integer cdTipoBemCandidato;
    private String dsTipoBemCandidato;
    private String dsBemCandidato;
    private Double vrBemCandidato;
    private LocalDate dtUltimaAtualizacao;
    private LocalTime hhUltimaAtualizacao;

    public BemCandidato() {
    }

    public BemCandidato(Integer tipoBemCodigo, String tipoBemDescricao) {
        this.cdTipoBemCandidato = tipoBemCodigo;
        this.dsTipoBemCandidato = tipoBemDescricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDtGeracao() {
        return dtGeracao;
    }

    public void setDtGeracao(LocalDate dtGeracao) {
        this.dtGeracao = dtGeracao;
    }

    public LocalTime getHhGeracao() {
        return hhGeracao;
    }

    public void setHhGeracao(LocalTime hhGeracao) {
        this.hhGeracao = hhGeracao;
    }

    public Integer getAnoEleicao() {
        return anoEleicao;
    }

    public void setAnoEleicao(Integer anoEleicao) {
        this.anoEleicao = anoEleicao;
    }

    public Integer getCdTipoEleicao() {
        return cdTipoEleicao;
    }

    public void setCdTipoEleicao(Integer cdTipoEleicao) {
        this.cdTipoEleicao = cdTipoEleicao;
    }

    public String getNmTipoEleicao() {
        return nmTipoEleicao;
    }

    public void setNmTipoEleicao(String nmTipoEleicao) {
        this.nmTipoEleicao = nmTipoEleicao;
    }

    public Integer getCdEleicao() {
        return cdEleicao;
    }

    public void setCdEleicao(Integer cdEleicao) {
        this.cdEleicao = cdEleicao;
    }

    public String getDsEleicao() {
        return dsEleicao;
    }

    public void setDsEleicao(String dsEleicao) {
        this.dsEleicao = dsEleicao;
    }

    public LocalDate getDtEleicao() {
        return dtEleicao;
    }

    public void setDtEleicao(LocalDate dtEleicao) {
        this.dtEleicao = dtEleicao;
    }

    public String getSgUf() {
        return sgUf;
    }

    public void setSgUf(String sgUf) {
        this.sgUf = sgUf;
    }

    public String getSgUe() {
        return sgUe;
    }

    public void setSgUe(String sgUe) {
        this.sgUe = sgUe;
    }

    public String getNmUe() {
        return nmUe;
    }

    public void setNmUe(String nmUe) {
        this.nmUe = nmUe;
    }

    public String getSqCandidato() {
        return sqCandidato;
    }

    public void setSqCandidato(String sqCandidato) {
        this.sqCandidato = sqCandidato;
    }

    public String getNrOrdemCandidato() {
        return nrOrdemCandidato;
    }

    public void setNrOrdemCandidato(String nrOrdemCandidato) {
        this.nrOrdemCandidato = nrOrdemCandidato;
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

    public String getDsBemCandidato() {
        return dsBemCandidato;
    }

    public void setDsBemCandidato(String dsBemCandidato) {
        this.dsBemCandidato = dsBemCandidato;
    }

    public Double getVrBemCandidato() {
        return vrBemCandidato;
    }

    public void setVrBemCandidato(Double vrBemCandidato) {
        this.vrBemCandidato = vrBemCandidato;
    }

    public LocalDate getDtUltimaAtualizacao() {
        return dtUltimaAtualizacao;
    }

    public void setDtUltimaAtualizacao(LocalDate dtUltimaAtualizacao) {
        this.dtUltimaAtualizacao = dtUltimaAtualizacao;
    }

    public LocalTime getHhUltimaAtualizacao() {
        return hhUltimaAtualizacao;
    }

    public void setHhUltimaAtualizacao(LocalTime hhUltimaAtualizacao) {
        this.hhUltimaAtualizacao = hhUltimaAtualizacao;
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

    public static class Builder {
        private Integer tipoBemCodigo;
        private String tipoBemDescricao;

        public Builder comTipoBemCodigo(Integer tipoBemCodigo) {
            this.tipoBemCodigo = tipoBemCodigo;
            return this;
        }

        public Builder comTipoBemDescricao(String tipoBemDescricao) {
            this.tipoBemDescricao = tipoBemDescricao;
            return this;
        }

        public BemCandidato buiild() {
            return new BemCandidato(tipoBemCodigo, tipoBemDescricao);
        }
    }
}