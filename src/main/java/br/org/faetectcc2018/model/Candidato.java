package br.org.faetectcc2018.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "candidatos")
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "ano_eleicao")
    private Integer anoEleicao;
    @Column(name = "num_turno")
    private Integer numTurno;
    @Column(name = "descricao_eleicao",length = 70)
    private String descricaoEleicao;
    @Column(name = "sigla_uf", length = 2)
    private String siglaUf;
    @Column(name = "sigla_ue", length = 5)
    private String siglaUE;
    @Column(name = "descricao_ue", length = 100)
    private String descricaoUE;
    @Column(name = "codigo_cargo")
    private Integer codigoCargo;
    @Column(name = "descricao_cargo")
    private String descricaoCargo;
    @Column(name = "nome_candidato")
    private String nomeCandidato;
    @Column(name = "sequencial_candidato")
    private Integer sequencialCandidato;
    @Column(name = "numero_candidato")
    private String numeroCandidato;
    @Column(name = "cpf_candidato")
    private String cpfCandidato;
    @Column(name = "nome_urna_candidato")
    private String nomeUrnaCandidato;
    @Column(name = "cod_situacao_candidatura")
    private Integer codSituacaoCandidatura;
    @Column(name = "des_situacao_candidatura")
    private String desSituacaoCandidatura;
    @Column(name = "numero_partido")
    private String numeroPartido;
    @Column(name = "sigla_partido")
    private String siglaPartido;
    @Column(name = "nome_partido")
    private String nomePartido;
    @Column(name = "codigo_legenda")
    private Integer codigoLegenda;
    @Column(name = "sigla_legenda")
    private String siglaLegenda;
    @Column(name = "composicao_legenda")
    private String composicaoLegenda;
    @Column(name = "nome_legenda")
    private String nomeLegenda;
    @Column(name = "codigo_ocupacao")
    private Integer codigoOcupacao;
    @Column(name = "descricao_ocupacao")
    private String descricaoOcupacao;
    @Column(name = "data_nascimento")
    private Date dataNascimento;
    @Column(name = "num_titulo_eleitoral_candidato")
    private String numTituloEleitoralCandidato;
    @Column(name = "idade_data_eleicao")
    private Integer idadeDataEleicao;
    @Column(name = "codigo_sexo")
    private Integer codigoSexo;
    @Column(name = "descricao_sexo")
    private String descricaoSexo;
    @Column(name = "cod_grau_instrucao")
    private Integer codGrauInstrucao;
    @Column(name = "descricao_grau_instrucao")
    private String descricaoGrauInstrucao;
    @Column(name = "codigo_estado_civil")
    private Integer codigoEstadoCivil;
    @Column(name = "descricao_estado_civil")
    private String descricaoEstadoCivil;
    @Column(name = "codigo_cor_raca")
    private Integer codigoCorRaca;
    @Column(name = "descricao_cor_raca")
    private String descricaoCorRaca;
    @Column(name = "codigo_nacionalidade")
    private Integer codigoNascionalidade;
    @Column(name = "descricao_nacionalidade")
    private String descricaoNascionalidade;
    @Column(name = "sigla_uf_nascimento")
    private String siglaUfNascimento;
    @Column(name = "codigo_municipio_nascimento")
    private Integer codigoMunicipioNascimento;
    @Column(name = "nome_municipio_nascimento")
    private String nomeMunicipioNascimento;
    @Column(name = "despesa_max_campanha")
    private Double despesaMaxCampanha;
    @Column(name = "cod_sit_tot_turno")
    private Integer codSitTotTurno;
    @Column(name = "desc_sit_tot_turno")
    private String descSitTotTurno;
    @Column(name = "nm_email")
    private String nmEmail;
    @Column(name = "datahora_geracao")
    private Date dataHoraGeracao;

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

    public String getSiglaUE() {
        return siglaUE;
    }

    public void setSiglaUE(String siglaUE) {
        this.siglaUE = siglaUE;
    }

    public String getDescricaoUE() {
        return descricaoUE;
    }

    public void setDescricaoUE(String descricaoUE) {
        this.descricaoUE = descricaoUE;
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

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public Integer getSequencialCandidato() {
        return sequencialCandidato;
    }

    public void setSequencialCandidato(Integer sequencialCandidato) {
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

    public Integer getCodSituacaoCandidatura() {
        return codSituacaoCandidatura;
    }

    public void setCodSituacaoCandidatura(Integer codSituacaoCandidatura) {
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

    public Integer getCodigoLegenda() {
        return codigoLegenda;
    }

    public void setCodigoLegenda(Integer codigoLegenda) {
        this.codigoLegenda = codigoLegenda;
    }

    public String getSiglaLegenda() {
        return siglaLegenda;
    }

    public void setSiglaLegenda(String siglaLegenda) {
        this.siglaLegenda = siglaLegenda;
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

    public Integer getCodigoOcupacao() {
        return codigoOcupacao;
    }

    public void setCodigoOcupacao(Integer codigoOcupacao) {
        this.codigoOcupacao = codigoOcupacao;
    }

    public String getDescricaoOcupacao() {
        return descricaoOcupacao;
    }

    public void setDescricaoOcupacao(String descricaoOcupacao) {
        this.descricaoOcupacao = descricaoOcupacao;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNumTituloEleitoralCandidato() {
        return numTituloEleitoralCandidato;
    }

    public void setNumTituloEleitoralCandidato(String numTituloEleitoralCandidato) {
        this.numTituloEleitoralCandidato = numTituloEleitoralCandidato;
    }

    public Integer getIdadeDataEleicao() {
        return idadeDataEleicao;
    }

    public void setIdadeDataEleicao(Integer idadeDataEleicao) {
        this.idadeDataEleicao = idadeDataEleicao;
    }

    public Integer getCodigoSexo() {
        return codigoSexo;
    }

    public void setCodigoSexo(Integer codigoSexo) {
        this.codigoSexo = codigoSexo;
    }

    public String getDescricaoSexo() {
        return descricaoSexo;
    }

    public void setDescricaoSexo(String descricaoSexo) {
        this.descricaoSexo = descricaoSexo;
    }

    public Integer getCodGrauInstrucao() {
        return codGrauInstrucao;
    }

    public void setCodGrauInstrucao(Integer codGrauInstrucao) {
        this.codGrauInstrucao = codGrauInstrucao;
    }

    public String getDescricaoGrauInstrucao() {
        return descricaoGrauInstrucao;
    }

    public void setDescricaoGrauInstrucao(String descricaoGrauInstrucao) {
        this.descricaoGrauInstrucao = descricaoGrauInstrucao;
    }

    public Integer getCodigoEstadoCivil() {
        return codigoEstadoCivil;
    }

    public void setCodigoEstadoCivil(Integer codigoEstadoCivil) {
        this.codigoEstadoCivil = codigoEstadoCivil;
    }

    public String getDescricaoEstadoCivil() {
        return descricaoEstadoCivil;
    }

    public void setDescricaoEstadoCivil(String descricaoEstadoCivil) {
        this.descricaoEstadoCivil = descricaoEstadoCivil;
    }

    public Integer getCodigoCorRaca() {
        return codigoCorRaca;
    }

    public void setCodigoCorRaca(Integer codigoCorRaca) {
        this.codigoCorRaca = codigoCorRaca;
    }

    public String getDescricaoCorRaca() {
        return descricaoCorRaca;
    }

    public void setDescricaoCorRaca(String descricaoCorRaca) {
        this.descricaoCorRaca = descricaoCorRaca;
    }

    public Integer getCodigoNascionalidade() {
        return codigoNascionalidade;
    }

    public void setCodigoNascionalidade(Integer codigoNascionalidade) {
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

    public Integer getCodigoMunicipioNascimento() {
        return codigoMunicipioNascimento;
    }

    public void setCodigoMunicipioNascimento(Integer codigoMunicipioNascimento) {
        this.codigoMunicipioNascimento = codigoMunicipioNascimento;
    }

    public String getNomeMunicipioNascimento() {
        return nomeMunicipioNascimento;
    }

    public void setNomeMunicipioNascimento(String nomeMunicipioNascimento) {
        this.nomeMunicipioNascimento = nomeMunicipioNascimento;
    }

    public Double getDespesaMaxCampanha() {
        return despesaMaxCampanha;
    }

    public void setDespesaMaxCampanha(Double despesaMaxCampanha) {
        this.despesaMaxCampanha = despesaMaxCampanha;
    }

    public Integer getCodSitTotTurno() {
        return codSitTotTurno;
    }

    public void setCodSitTotTurno(Integer codSitTotTurno) {
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

    public Date getDataHoraGeracao() {
        return dataHoraGeracao;
    }

    public void setDataHoraGeracao(Date dataHoraGeracao) {
        this.dataHoraGeracao = dataHoraGeracao;
    }
}