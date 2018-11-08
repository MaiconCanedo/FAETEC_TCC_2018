package br.org.faetectcc2018.dto;

import br.org.faetectcc2018.model.Candidato;

import java.util.StringJoiner;

public class CargoDTO {

    private Integer codigo;
    private String descricao;

    public CargoDTO() {
    }

    public CargoDTO(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public CargoDTO(Candidato candidato) {
        codigo = candidato.getCdCargo();
        descricao = candidato.getDsCargo();
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

    @Override
    public String toString() {
        return new StringJoiner(", ", CargoDTO.class.getSimpleName() + "[", "]")
                .add("codigo=" + codigo)
                .add("descricao='" + descricao + "'")
                .toString();
    }
}