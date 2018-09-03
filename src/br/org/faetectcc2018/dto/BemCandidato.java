package br.org.faetectcc2018.dto;

public class BemCandidato {

    private String anoEleicao;
    private String descricaoEleicao;
    private String siglaUf;
    private String sqCandidato;
    private String cdTipoBemCandidato;
    private String dsTipoBemCandidato;
    private String detalheBem;
    private String valorBem;

    public BemCandidato() {}

    public String getAnoEleicao() {
        return anoEleicao;
    }

    public void setAnoEleicao(String anoEleicao) {
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

    public String getCdTipoBemCandidato() {
        return cdTipoBemCandidato;
    }

    public void setCdTipoBemCandidato(String cdTipoBemCandidato) {
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

    public String getValorBem() {
        return valorBem;
    }

    public void setValorBem(String valorBem) {
        this.valorBem = valorBem;
    }
}