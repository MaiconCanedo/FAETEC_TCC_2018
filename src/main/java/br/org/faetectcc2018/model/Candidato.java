package br.org.faetectcc2018.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "candidatos")
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_candidato")
    private Long id;
    private LocalDate dtGeracao;
    private LocalTime hhGeracao;
    private Integer anoEleicao;
    private Integer cdTipoEleicao;
    private String nmTipoEleicao;
    private Integer nrTurno;
    private Integer cdEleicao;
    private String dsEleicao;
    private LocalDate dtEleicao;
    private String tpAbrangencia;
    private String sgUf;
    private String sgUe;
    private String nmUe;
    private Integer cdCargo;
    private String dsCargo;
    private String sqCandidato;
    private String nrCandidato;
    private String nmCandidato;
    private String nmUrnaCandidato;
    private String nmSocialCandidato;
    private String nrCpfCandidato;
    private String nmEmail;
    private Integer cdSituacaoCandidatura;
    private String dsSituacaoCandidatura;
    private Integer cdDetalheSituacaoCand;
    private String dsDetalheSituacaoCand;
    private String tpAgremiacao;
    private Integer nrPartido;
    private String sgPartido;
    private String nmPartido;
    private String sqColigacao;
    private String nmColigacao;
    private String dsComposicaoColigacao;
    private Integer cdNacionalidade;
    private String dsNacionalidade;
    private String sgUfNascimento;
    private Integer cdMunicipioNascimento;
    private String nmMunicipioNascimento;
    private LocalDate dtNascimento;
    private Integer nrIdadeDataPosse;
    private String nrTituloEleitoralCandidato;
    private Integer cdGenero;
    private String dsGenero;
    private Integer cdGrauInstrucao;
    private String dsGrauInstrucao;
    private Integer cdEstadoCivil;
    private String dsEstadoCivil;
    private Integer cdCorRaca;
    private String dsCorRaca;
    private Integer cdOcupacao;
    private String dsOcupacao;
    private Integer nrDespesaMaxCampanha;
    private Integer cdSitTotTurno;
    private String dsSitTotTurno;
    private String stReeleicao;
    private String stDeclararBens;
    private Integer nrProtocoloCandidatura;
    private Long nrProcesso;

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

    public Integer getNrTurno() {
        return nrTurno;
    }

    public void setNrTurno(Integer nrTurno) {
        this.nrTurno = nrTurno;
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

    public String getTpAbrangencia() {
        return tpAbrangencia;
    }

    public void setTpAbrangencia(String tpAbrangencia) {
        this.tpAbrangencia = tpAbrangencia;
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

    public Integer getCdCargo() {
        return cdCargo;
    }

    public void setCdCargo(Integer cdCargo) {
        this.cdCargo = cdCargo;
    }

    public String getDsCargo() {
        return dsCargo;
    }

    public void setDsCargo(String dsCargo) {
        this.dsCargo = dsCargo;
    }

    public String getSqCandidato() {
        return sqCandidato;
    }

    public void setSqCandidato(String sqCandidato) {
        this.sqCandidato = sqCandidato;
    }

    public String getNrCandidato() {
        return nrCandidato;
    }

    public void setNrCandidato(String nrCandidato) {
        this.nrCandidato = nrCandidato;
    }

    public String getNmCandidato() {
        return nmCandidato;
    }

    public void setNmCandidato(String nmCandidato) {
        this.nmCandidato = nmCandidato;
    }

    public String getNmUrnaCandidato() {
        return nmUrnaCandidato;
    }

    public void setNmUrnaCandidato(String nmUrnaCandidato) {
        this.nmUrnaCandidato = nmUrnaCandidato;
    }

    public String getNmSocialCandidato() {
        return nmSocialCandidato;
    }

    public void setNmSocialCandidato(String nmSocialCandidato) {
        this.nmSocialCandidato = nmSocialCandidato;
    }

    public String getNrCpfCandidato() {
        return nrCpfCandidato;
    }

    public void setNrCpfCandidato(String nrCpfCandidato) {
        this.nrCpfCandidato = nrCpfCandidato;
    }

    public String getNmEmail() {
        return nmEmail;
    }

    public void setNmEmail(String nmEmail) {
        this.nmEmail = nmEmail;
    }

    public Integer getCdSituacaoCandidatura() {
        return cdSituacaoCandidatura;
    }

    public void setCdSituacaoCandidatura(Integer cdSituacaoCandidatura) {
        this.cdSituacaoCandidatura = cdSituacaoCandidatura;
    }

    public String getDsSituacaoCandidatura() {
        return dsSituacaoCandidatura;
    }

    public void setDsSituacaoCandidatura(String dsSituacaoCandidatura) {
        this.dsSituacaoCandidatura = dsSituacaoCandidatura;
    }

    public Integer getCdDetalheSituacaoCand() {
        return cdDetalheSituacaoCand;
    }

    public void setCdDetalheSituacaoCand(Integer cdDetalheSituacaoCand) {
        this.cdDetalheSituacaoCand = cdDetalheSituacaoCand;
    }

    public String getDsDetalheSituacaoCand() {
        return dsDetalheSituacaoCand;
    }

    public void setDsDetalheSituacaoCand(String dsDetalheSituacaoCand) {
        this.dsDetalheSituacaoCand = dsDetalheSituacaoCand;
    }

    public String getTpAgremiacao() {
        return tpAgremiacao;
    }

    public void setTpAgremiacao(String tpAgremiacao) {
        this.tpAgremiacao = tpAgremiacao;
    }

    public Integer getNrPartido() {
        return nrPartido;
    }

    public void setNrPartido(Integer nrPartido) {
        this.nrPartido = nrPartido;
    }

    public String getSgPartido() {
        return sgPartido;
    }

    public void setSgPartido(String sgPartido) {
        this.sgPartido = sgPartido;
    }

    public String getNmPartido() {
        return nmPartido;
    }

    public void setNmPartido(String nmPartido) {
        this.nmPartido = nmPartido;
    }

    public String getSqColigacao() {
        return sqColigacao;
    }

    public void setSqColigacao(String sqColigacao) {
        this.sqColigacao = sqColigacao;
    }

    public String getNmColigacao() {
        return nmColigacao;
    }

    public void setNmColigacao(String nmColigacao) {
        this.nmColigacao = nmColigacao;
    }

    public String getDsComposicaoColigacao() {
        return dsComposicaoColigacao;
    }

    public void setDsComposicaoColigacao(String dsComposicaoColigacao) {
        this.dsComposicaoColigacao = dsComposicaoColigacao;
    }

    public Integer getCdNacionalidade() {
        return cdNacionalidade;
    }

    public void setCdNacionalidade(Integer cdNacionalidade) {
        this.cdNacionalidade = cdNacionalidade;
    }

    public String getDsNacionalidade() {
        return dsNacionalidade;
    }

    public void setDsNacionalidade(String dsNacionalidade) {
        this.dsNacionalidade = dsNacionalidade;
    }

    public String getSgUfNascimento() {
        return sgUfNascimento;
    }

    public void setSgUfNascimento(String sgUfNascimento) {
        this.sgUfNascimento = sgUfNascimento;
    }

    public Integer getCdMunicipioNascimento() {
        return cdMunicipioNascimento;
    }

    public void setCdMunicipioNascimento(Integer cdMunicipioNascimento) {
        this.cdMunicipioNascimento = cdMunicipioNascimento;
    }

    public String getNmMunicipioNascimento() {
        return nmMunicipioNascimento;
    }

    public void setNmMunicipioNascimento(String nmMunicipioNascimento) {
        this.nmMunicipioNascimento = nmMunicipioNascimento;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public Integer getNrIdadeDataPosse() {
        return nrIdadeDataPosse;
    }

    public void setNrIdadeDataPosse(Integer nrIdadeDataPosse) {
        this.nrIdadeDataPosse = nrIdadeDataPosse;
    }

    public String getNrTituloEleitoralCandidato() {
        return nrTituloEleitoralCandidato;
    }

    public void setNrTituloEleitoralCandidato(String nrTituloEleitoralCandidato) {
        this.nrTituloEleitoralCandidato = nrTituloEleitoralCandidato;
    }

    public Integer getCdGenero() {
        return cdGenero;
    }

    public void setCdGenero(Integer cdGenero) {
        this.cdGenero = cdGenero;
    }

    public String getDsGenero() {
        return dsGenero;
    }

    public void setDsGenero(String dsGenero) {
        this.dsGenero = dsGenero;
    }

    public Integer getCdGrauInstrucao() {
        return cdGrauInstrucao;
    }

    public void setCdGrauInstrucao(Integer cdGrauInstrucao) {
        this.cdGrauInstrucao = cdGrauInstrucao;
    }

    public String getDsGrauInstrucao() {
        return dsGrauInstrucao;
    }

    public void setDsGrauInstrucao(String dsGrauInstrucao) {
        this.dsGrauInstrucao = dsGrauInstrucao;
    }

    public Integer getCdEstadoCivil() {
        return cdEstadoCivil;
    }

    public void setCdEstadoCivil(Integer cdEstadoCivil) {
        this.cdEstadoCivil = cdEstadoCivil;
    }

    public String getDsEstadoCivil() {
        return dsEstadoCivil;
    }

    public void setDsEstadoCivil(String dsEstadoCivil) {
        this.dsEstadoCivil = dsEstadoCivil;
    }

    public Integer getCdCorRaca() {
        return cdCorRaca;
    }

    public void setCdCorRaca(Integer cdCorRaca) {
        this.cdCorRaca = cdCorRaca;
    }

    public String getDsCorRaca() {
        return dsCorRaca;
    }

    public void setDsCorRaca(String dsCorRaca) {
        this.dsCorRaca = dsCorRaca;
    }

    public Integer getCdOcupacao() {
        return cdOcupacao;
    }

    public void setCdOcupacao(Integer cdOcupacao) {
        this.cdOcupacao = cdOcupacao;
    }

    public String getDsOcupacao() {
        return dsOcupacao;
    }

    public void setDsOcupacao(String dsOcupacao) {
        this.dsOcupacao = dsOcupacao;
    }

    public Integer getNrDespesaMaxCampanha() {
        return nrDespesaMaxCampanha;
    }

    public void setNrDespesaMaxCampanha(Integer nrDespesaMaxCampanha) {
        this.nrDespesaMaxCampanha = nrDespesaMaxCampanha;
    }

    public Integer getCdSitTotTurno() {
        return cdSitTotTurno;
    }

    public void setCdSitTotTurno(Integer cdSitTotTurno) {
        this.cdSitTotTurno = cdSitTotTurno;
    }

    public String getDsSitTotTurno() {
        return dsSitTotTurno;
    }

    public void setDsSitTotTurno(String dsSitTotTurno) {
        this.dsSitTotTurno = dsSitTotTurno;
    }

    public String getStReeleicao() {
        return stReeleicao;
    }

    public void setStReeleicao(String stReeleicao) {
        this.stReeleicao = stReeleicao;
    }

    public String getStDeclararBens() {
        return stDeclararBens;
    }

    public void setStDeclararBens(String stDeclararBens) {
        this.stDeclararBens = stDeclararBens;
    }

    public Integer getNrProtocoloCandidatura() {
        return nrProtocoloCandidatura;
    }

    public void setNrProtocoloCandidatura(Integer nrProtocoloCandidatura) {
        this.nrProtocoloCandidatura = nrProtocoloCandidatura;
    }

    public Long getNrProcesso() {
        return nrProcesso;
    }

    public void setNrProcesso(Long nrProcesso) {
        this.nrProcesso = nrProcesso;
    }
}