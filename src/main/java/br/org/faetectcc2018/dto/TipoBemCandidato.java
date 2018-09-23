package br.org.faetectcc2018.model.dto;

public class TipoBemCandidato {

    private Integer codigo;
    private String descricao;

    public TipoBemCandidato() {
    }

    public TipoBemCandidato(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
