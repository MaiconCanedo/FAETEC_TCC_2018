package br.org.faetectcc2018.dto;

import java.util.Objects;
import java.util.StringJoiner;

public class TipoBemDTO {

    private Integer cdTipoBemCandidato;
    private String dsTipoBemCandidato;

    public TipoBemDTO() {
    }

    public TipoBemDTO(Integer codigo, String descricao) {
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

    @Override
    public String toString() {
        return new StringJoiner(", ", TipoBemDTO.class.getSimpleName() + "[", "]")
                .add("cdTipoBemCandidato=" + cdTipoBemCandidato)
                .add("dsTipoBemCandidato='" + dsTipoBemCandidato + "'")
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoBemDTO that = (TipoBemDTO) o;
        return Objects.equals(cdTipoBemCandidato, that.cdTipoBemCandidato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdTipoBemCandidato);
    }
}