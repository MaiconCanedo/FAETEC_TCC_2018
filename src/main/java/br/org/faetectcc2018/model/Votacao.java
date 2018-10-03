package br.org.faetectcc2018.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "votacoes")
public class Votacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer anoEleicao;
    private Integer numTurno;

    @Column(length = 70)
    private String descricaoEleicao;

    @Column(length = 2)
    private String siglaUf;

    @Column(length = 5)
    private String siglaUe;

    private Integer codigoMunicipio;

    @Column(length = 50)
    private String nomeMunicipio;

    private Integer numeroZona;
    private Integer codigoCargo;
    private String numeroCand;

    @Column(length = 11)
    private String sqCandidato;

    @Column(length = 100)
    private String nomeCandidato;

    @Column(length = 50)
    private String nomeUrnaCandidato;

    @Column(length = 80)
    private String descricaoCargo;

    private Integer codSitCandSuperior;

    @Column(length = 30)
    private String descSitCandSuperior;

    @Column(name = "codigo_sit_cadidato")
    private Integer codigoSitCandidato;

    @Column(length = 30)
    private String descSitCandidato;

    private Integer codigoSitCandTot;

    @Column(length = 30) //desc_sit_cand_tot
    private String descSitCandTot;

    private Integer numeroPartido;

    @Column(length = 10)
    private String siglaPartido;

    @Column(length =  100)
    private String nomePartido;

    private Integer sequencialLegenda;

    @Column(length = 100)
    private String nomeColigacao;

    @Column(length = 100)
    private String composicaoLegenda;

    private Long totalVotos;
    private String transito;

    @Temporal(TemporalType.TIMESTAMP)
    private Date datahoraGeracao;

    public Votacao() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Objects.equals(id, ((Votacao)o).id);
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

    public Integer getNumTurno() {
        return numTurno;
    }

    public void setNumTurno(Integer numTurno) {
        this.numTurno = numTurno;
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

    public String getSiglaUe() {
        return siglaUe;
    }

    public void setSiglaUe(String siglaUe) {
        this.siglaUe = siglaUe;
    }

    public Integer getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public void setCodigoMunicipio(Integer codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    public String getNomeMunicipio() {
        return nomeMunicipio;
    }

    public void setNomeMunicipio(String nomeMunicipio) {
        this.nomeMunicipio = nomeMunicipio;
    }

    public Integer getNumeroZona() {
        return numeroZona;
    }

    public void setNumeroZona(Integer numeroZona) {
        this.numeroZona = numeroZona;
    }

    public Integer getCodigoCargo() {
        return codigoCargo;
    }

    public void setCodigoCargo(Integer codigoCargo) {
        this.codigoCargo = codigoCargo;
    }

    public String getNumeroCand() {
        return numeroCand;
    }

    public void setNumeroCand(String numeroCand) {
        this.numeroCand = numeroCand;
    }

    public String getSqCandidato() {
        return sqCandidato;
    }

    public void setSqCandidato(String sqCandidato) {
        this.sqCandidato = sqCandidato;
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public String getNomeUrnaCandidato() {
        return nomeUrnaCandidato;
    }

    public void setNomeUrnaCandidato(String nomeUrnaCandidato) {
        this.nomeUrnaCandidato = nomeUrnaCandidato;
    }

    public String getDescricaoCargo() {
        return descricaoCargo;
    }

    public void setDescricaoCargo(String descricaoCargo) {
        this.descricaoCargo = descricaoCargo;
    }

    public Integer getCodSitCandSuperior() {
        return codSitCandSuperior;
    }

    public void setCodSitCandSuperior(Integer codSitCandSuperior) {
        this.codSitCandSuperior = codSitCandSuperior;
    }

    public String getDescSitCandSuperior() {
        return descSitCandSuperior;
    }

    public void setDescSitCandSuperior(String descSitCandSuperior) {
        this.descSitCandSuperior = descSitCandSuperior;
    }

    public Integer getCodigoSitCandidato() {
        return codigoSitCandidato;
    }

    public void setCodigoSitCandidato(Integer codigoSitCandidato) {
        this.codigoSitCandidato = codigoSitCandidato;
    }

    public String getDescSitCandidato() {
        return descSitCandidato;
    }

    public void setDescSitCandidato(String descSitCandidato) {
        this.descSitCandidato = descSitCandidato;
    }

    public Integer getCodigoSitCandTot() {
        return codigoSitCandTot;
    }

    public void setCodigoSitCandTot(Integer codigoSitCandTot) {
        this.codigoSitCandTot = codigoSitCandTot;
    }

    public String getDescSitCandTot() {
        return descSitCandTot;
    }

    public void setDescSitCandTot(String descigoSitCandTot) {
        this.descSitCandTot = descigoSitCandTot;
    }

    public Integer getNumeroPartido() {
        return numeroPartido;
    }

    public void setNumeroPartido(Integer numeroPartido) {
        this.numeroPartido = numeroPartido;
    }

    public String getSiglaPartido() {
        return siglaPartido;
    }

    public void setSiglaPartido(String siglaPartido) {
        this.siglaPartido = siglaPartido;
    }

    public String getNomePartido() {
        return nomePartido;
    }

    public void setNomePartido(String nomePartido) {
        this.nomePartido = nomePartido;
    }

    public Integer getSequencialLegenda() {
        return sequencialLegenda;
    }

    public void setSequencialLegenda(Integer sequencialLegenda) {
        this.sequencialLegenda = sequencialLegenda;
    }

    public String getNomeColigacao() {
        return nomeColigacao;
    }

    public void setNomeColigacao(String nomeColigacao) {
        this.nomeColigacao = nomeColigacao;
    }

    public String getComposicaoLegenda() {
        return composicaoLegenda;
    }

    public void setComposicaoLegenda(String composicaoLegenda) {
        this.composicaoLegenda = composicaoLegenda;
    }

    public Long getTotalVotos() {
        return totalVotos;
    }

    public void setTotalVotos(Long totalVotos) {
        this.totalVotos = totalVotos;
    }

    public String getTransito() {
        return transito;
    }

    public void setTransito(String transito) {
        this.transito = transito;
    }

    public Date getDatahoraGeracao() {
        return datahoraGeracao;
    }

    public void setDatahoraGeracao(Date dataHoraGeracao) {
        this.datahoraGeracao = dataHoraGeracao;
    }
}