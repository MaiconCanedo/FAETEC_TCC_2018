package br.org.faetectcc2018.modelo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "candidatos")
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "ano_eleicao")
    private String anoEleicao;
    @Column(name = "num_turno")
    private String numTurno;
    @Column(name = "descricao_eleicao")
    private String descricaoEleicao;
    @Column(name = "sigla_uf")
    private String siglaUf;
    @Column(name = "sigla_ue")
    private String siglaUE;
    @Column(name = "descricao_ue")
    private String descricaoUE;
    @Column(name = "codigo_cargo")
    private String codigoCargo;
    @Column(name = "descricao_cargo")
    private String descricaoCargo;
    @Column(name = "nome_candidato")
    private String nomeCandidato;
    @Column(name = "sequencial_candidato")
    private String sequencialCandidato;
    @Column(name = "numero_candidato")
    private String numeroCandidato;
    @Column(name = "cpf_candidato")
    private String cpfCandidato;
    @Column(name = "nome_urna_candidato")
    private String nomeUrnaCandidato;
    @Column(name = "cod_situacao_candidatura")
    private String codSituacaoCandidatura;
    @Column(name = "des_situacao_candidatura")
    private String desSituacaoCandidatura;
    @Column(name = "numero_partido")
    private String numeroPartido;
    @Column(name = "sigla_partido")
    private String siglaPartido;
    @Column(name = "nome_partido")
    private String nomePartido;
    @Column(name = "codigo_legenda")
    private String codigoLegenda;
    @Column(name = "sigla_legenda")
    private String siglaLegenda;
    @Column(name = "composicao_legenda")
    private String composicaoLegenda;
    @Column(name = "nome_legenda")
    private String nomeLegenda;
    @Column(name = "codigo_ocupacao")
    private String codigoOcupacao;
    @Column(name = "descricao_ocupacao")
    private String descricaoOcupacao;
    @Column(name = "data_nascimento")
    private String dataNascimento;
    @Column(name = "num_titulo_eleitoral_candidato")
    private String numTituloEleitoralCandidato;
    @Column(name = "idade_data_eleicao")
    private String idadeDataEleicao;
    @Column(name = "codigo_sexo")
    private String codigoSexo;
    @Column(name = "descricao_sexo")
    private String descricaoSexo;
    @Column(name = "cod_grau_instrucao")
    private String codGrauInstrucao;
    @Column(name = "descricao_grau_instrucao")
    private String descricaoGrauInstrucao;
    @Column(name = "codigo_estado_civil")
    private String codigoEstadoCivil;
    @Column(name = "descricao_estado_civil")
    private String descricaoEstadoCivil;
    @Column(name = "codigo_cor_raca")
    private String codigoCorRaca;
    @Column(name = "descricao_cor_raca")
    private String descricaoCorRaca;
    @Column(name = "codigo_nacionalidade")
    private String codigoNascionalidade;
    @Column(name = "descricao_nacionalidade")
    private String descricaoNascionalidade;
    @Column(name = "sigla_uf_nascimento")
    private String siglaUfNascimento;
    @Column(name = "codigo_municipio_nascimento")
    private String codigoMunicipioNascimento;
    @Column(name = "nome_municipio_nascimento")
    private String nomeMunicipioNascimento;
    @Column(name = "despesa_max_campanha")
    private String despesaMaxCampanha;
    @Column(name = "cod_sit_tot_turno")
    private String codSitTotTurno;
    @Column(name = "desc_sit_tot_turno")
    private String descSitTotTurno;
    @Column(name = "nm_email")
    private String nmEmail;
    @Column(name = "datahora_geracao")
    private String dataHoraGeracao;

    public Candidato() {}

    @Override
    public String toString() {
        return "Candidato{" +
                "id=" + id +
                ", anoEleicao='" + anoEleicao + '\'' +
                ", numTurno='" + numTurno + '\'' +
                ", descricaoEleicao='" + descricaoEleicao + '\'' +
                ", siglaUf='" + siglaUf + '\'' +
                ", siglaUE='" + siglaUE + '\'' +
                ", descricaoUE='" + descricaoUE + '\'' +
                ", codigoCargo='" + codigoCargo + '\'' +
                ", descricaoCargo='" + descricaoCargo + '\'' +
                ", nomeCandidato='" + nomeCandidato + '\'' +
                ", sequencialCandidato='" + sequencialCandidato + '\'' +
                ", numeroCandidato='" + numeroCandidato + '\'' +
                ", cpfCandidato='" + cpfCandidato + '\'' +
                ", nomeUrnaCandidato='" + nomeUrnaCandidato + '\'' +
                ", codSituacaoCandidatura='" + codSituacaoCandidatura + '\'' +
                ", desSituacaoCandidatura='" + desSituacaoCandidatura + '\'' +
                ", numeroPartido='" + numeroPartido + '\'' +
                ", siglaPartido='" + siglaPartido + '\'' +
                ", nomePartido='" + nomePartido + '\'' +
                ", codigoLegenda='" + codigoLegenda + '\'' +
                ", siglaLegenda='" + siglaLegenda + '\'' +
                ", composicaoLegenda='" + composicaoLegenda + '\'' +
                ", nomeLegenda='" + nomeLegenda + '\'' +
                ", codigoOcupacao='" + codigoOcupacao + '\'' +
                ", descricaoOcupacao='" + descricaoOcupacao + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", numTituloEleitoralCandidato='" + numTituloEleitoralCandidato + '\'' +
                ", idadeDataEleicao='" + idadeDataEleicao + '\'' +
                ", codigoSexo='" + codigoSexo + '\'' +
                ", descricaoSexo='" + descricaoSexo + '\'' +
                ", codGrauInstrucao='" + codGrauInstrucao + '\'' +
                ", descricaoGrauInstrucao='" + descricaoGrauInstrucao + '\'' +
                ", codigoEstadoCivil='" + codigoEstadoCivil + '\'' +
                ", descricaoEstadoCivil='" + descricaoEstadoCivil + '\'' +
                ", codigoCorRaca='" + codigoCorRaca + '\'' +
                ", descricaoCorRaca='" + descricaoCorRaca + '\'' +
                ", codigoNascionalidade='" + codigoNascionalidade + '\'' +
                ", descricaoNascionalidade='" + descricaoNascionalidade + '\'' +
                ", siglaUfNascimento='" + siglaUfNascimento + '\'' +
                ", codigoMunicipioNascimento='" + codigoMunicipioNascimento + '\'' +
                ", nomeMunicipioNascimento='" + nomeMunicipioNascimento + '\'' +
                ", despesaMaxCampanha='" + despesaMaxCampanha + '\'' +
                ", codSitTotTurno='" + codSitTotTurno + '\'' +
                ", descSitTotTurno='" + descSitTotTurno + '\'' +
                ", nmEmail='" + nmEmail + '\'' +
                ", dataHoraGeracao='" + dataHoraGeracao + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidato candidato = (Candidato) o;
        return Objects.equals(id, candidato.id);
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

    public String getDescricaoUE() {
        return descricaoUE;
    }

    public void setDescricaoUE(String descricaoUE) {
        this.descricaoUE = descricaoUE;
    }

    public String getSiglaLegenda() {
        return siglaLegenda;
    }

    public void setSiglaLegenda(String siglaLegenda) {
        this.siglaLegenda = siglaLegenda;
    }

    public String getAnoEleicao() {
        return anoEleicao;
    }

    public void setAnoEleicao(String anoEleicao) {
        this.anoEleicao = anoEleicao;
    }

    public String getNumTurno() {
        return numTurno;
    }

    public void setNumTurno(String numTruno) {
        this.numTurno = numTruno;
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

    public String getSiglaUE() {
        return siglaUE;
    }

    public void setSiglaUE(String siglaUE) {
        this.siglaUE = siglaUE;
    }

    public String getCodigoCargo() {
        return codigoCargo;
    }

    public void setCodigoCargo(String codigoCargo) {
        this.codigoCargo = codigoCargo;
    }

    public String getDescricaoCargo() {
        return descricaoCargo;
    }

    public void setDescricaoCargo(String descricaoCargo) {
        this.descricaoCargo = descricaoCargo;
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public String getSequencialCandidato() {
        return sequencialCandidato;
    }

    public void setSequencialCandidato(String sequencialCandidato) {
        this.sequencialCandidato = sequencialCandidato;
    }

    public String getNumeroCandidato() {
        return numeroCandidato;
    }

    public void setNumeroCandidato(String numeroCandidato) {
        this.numeroCandidato = numeroCandidato;
    }

    public String getCpfCandidato() {
        return cpfCandidato;
    }

    public void setCpfCandidato(String cpfCandidato) {
        this.cpfCandidato = cpfCandidato;
    }

    public String getNomeUrnaCandidato() {
        return nomeUrnaCandidato;
    }

    public void setNomeUrnaCandidato(String nomeUrnaCandidato) {
        this.nomeUrnaCandidato = nomeUrnaCandidato;
    }

    public String getCodSituacaoCandidatura() {
        return codSituacaoCandidatura;
    }

    public void setCodSituacaoCandidatura(String codSituacaoCandidatura) {
        this.codSituacaoCandidatura = codSituacaoCandidatura;
    }

    public String getDesSituacaoCandidatura() {
        return desSituacaoCandidatura;
    }

    public void setDesSituacaoCandidatura(String desSituacaoCandidatura) {
        this.desSituacaoCandidatura = desSituacaoCandidatura;
    }

    public String getNumeroPartido() {
        return numeroPartido;
    }

    public void setNumeroPartido(String numeroPartido) {
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

    public String getCodigoLegenda() {
        return codigoLegenda;
    }

    public void setCodigoLegenda(String codigoLegenda) {
        this.codigoLegenda = codigoLegenda;
    }

    public String getComposicaoLegenda() {
        return composicaoLegenda;
    }

    public void setComposicaoLegenda(String composicaoLegenda) {
        this.composicaoLegenda = composicaoLegenda;
    }

    public String getNomeLegenda() {
        return nomeLegenda;
    }

    public void setNomeLegenda(String nomeLegenda) {
        this.nomeLegenda = nomeLegenda;
    }

    public String getCodigoOcupacao() {
        return codigoOcupacao;
    }

    public void setCodigoOcupacao(String codigoOcupacao) {
        this.codigoOcupacao = codigoOcupacao;
    }

    public String getDescricaoOcupacao() {
        return descricaoOcupacao;
    }

    public void setDescricaoOcupacao(String descricaoOcupacao) {
        this.descricaoOcupacao = descricaoOcupacao;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNumTituloEleitoralCandidato() {
        return numTituloEleitoralCandidato;
    }

    public void setNumTituloEleitoralCandidato(String numTituloEleitoralCandidato) {
        this.numTituloEleitoralCandidato = numTituloEleitoralCandidato;
    }

    public String getIdadeDataEleicao() {
        return idadeDataEleicao;
    }

    public void setIdadeDataEleicao(String idadeDataEleicao) {
        this.idadeDataEleicao = idadeDataEleicao;
    }

    public String getCodigoSexo() {
        return codigoSexo;
    }

    public void setCodigoSexo(String codigoSexo) {
        this.codigoSexo = codigoSexo;
    }

    public String getDescricaoSexo() {
        return descricaoSexo;
    }

    public void setDescricaoSexo(String descricaoSexo) {
        this.descricaoSexo = descricaoSexo;
    }

    public String getCodGrauInstrucao() {
        return codGrauInstrucao;
    }

    public void setCodGrauInstrucao(String codGrauInstrucao) {
        this.codGrauInstrucao = codGrauInstrucao;
    }

    public String getDescricaoGrauInstrucao() {
        return descricaoGrauInstrucao;
    }

    public void setDescricaoGrauInstrucao(String descricaoGrauInstrucao) {
        this.descricaoGrauInstrucao = descricaoGrauInstrucao;
    }

    public String getCodigoEstadoCivil() {
        return codigoEstadoCivil;
    }

    public void setCodigoEstadoCivil(String codigoEstadoCivil) {
        this.codigoEstadoCivil = codigoEstadoCivil;
    }

    public String getDescricaoEstadoCivil() {
        return descricaoEstadoCivil;
    }

    public void setDescricaoEstadoCivil(String descricaoEstadoCivil) {
        this.descricaoEstadoCivil = descricaoEstadoCivil;
    }

    public String getCodigoCorRaca() {
        return codigoCorRaca;
    }

    public void setCodigoCorRaca(String codigoCorRaca) {
        this.codigoCorRaca = codigoCorRaca;
    }

    public String getDescricaoCorRaca() {
        return descricaoCorRaca;
    }

    public void setDescricaoCorRaca(String descricaoCorRaca) {
        this.descricaoCorRaca = descricaoCorRaca;
    }

    public String getCodigoNascionalidade() {
        return codigoNascionalidade;
    }

    public void setCodigoNascionalidade(String codigoNascionalidade) {
        this.codigoNascionalidade = codigoNascionalidade;
    }

    public String getDescricaoNascionalidade() {
        return descricaoNascionalidade;
    }

    public void setDescricaoNascionalidade(String descricaoNascionalidade) {
        this.descricaoNascionalidade = descricaoNascionalidade;
    }

    public String getSiglaUfNascimento() {
        return siglaUfNascimento;
    }

    public void setSiglaUfNascimento(String siglaUfNascimento) {
        this.siglaUfNascimento = siglaUfNascimento;
    }

    public String getCodigoMunicipioNascimento() {
        return codigoMunicipioNascimento;
    }

    public void setCodigoMunicipioNascimento(String codigoMunicipioNascimento) {
        this.codigoMunicipioNascimento = codigoMunicipioNascimento;
    }

    public String getNomeMunicipioNascimento() {
        return nomeMunicipioNascimento;
    }

    public void setNomeMunicipioNascimento(String nomeMunicipioNascimento) {
        this.nomeMunicipioNascimento = nomeMunicipioNascimento;
    }

    public String getDespesaMaxCampanha() {
        return despesaMaxCampanha;
    }

    public void setDespesaMaxCampanha(String despesaMaxCampanha) {
        this.despesaMaxCampanha = despesaMaxCampanha;
    }

    public String getCodSitTotTurno() {
        return codSitTotTurno;
    }

    public void setCodSitTotTurno(String codSitTotTurno) {
        this.codSitTotTurno = codSitTotTurno;
    }

    public String getDescSitTotTurno() {
        return descSitTotTurno;
    }

    public void setDescSitTotTurno(String descSitTotTurno) {
        this.descSitTotTurno = descSitTotTurno;
    }

    public String getNmEmail() {
        return nmEmail;
    }

    public void setNmEmail(String nmEmail) {
        this.nmEmail = nmEmail;
    }

    public String getDataHoraGeracao() {
        return dataHoraGeracao;
    }

    public void setDataHoraGeracao(String dataHoraGeracao) {
        this.dataHoraGeracao = dataHoraGeracao;
    }
}