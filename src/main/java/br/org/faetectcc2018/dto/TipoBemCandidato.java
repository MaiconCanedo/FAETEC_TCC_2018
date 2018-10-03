package br.org.faetectcc2018.dto;

public class TipoBemCandidato {

    private Integer cdTipoBemCandidato;
    private String dsTipoBemCandidato;

    public TipoBemCandidato() {
    }

    public TipoBemCandidato(Integer codigo, String descricao) {
        this.cdTipoBemCandidato = codigo;
        this.dsTipoBemCandidato = descricao;
    }

    public Integer getCodigo() {
        return cdTipoBemCandidato;
    }

    public void setCodigo(Integer codigo) {
        this.cdTipoBemCandidato = codigo;
    }

    public String getDescricao() {
        return dsTipoBemCandidato;
    }

    public void setDescricao(String descricao) {
        this.dsTipoBemCandidato = descricao;
    }
}