package br.org.faetectcc2018.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

@Entity
@Table(name = "despesa_candidato")
public class DespesaCandidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_desp_candidato")
    private Long id;

    private LocalDate dtGeracao;

    private LocalTime hhEleicao;

    private Integer anoEleicao;

    private Integer cdTipoEleicao;

    @Column(length = 17)
    private String nmTipoEleicao;

    private Integer cdEleicao;

    @Column(length = 30)
    private String dsEleicao;

    private LocalDate dtEleicao;

    private Integer stTurno;

    @Column(length = 20)
    private String tpPrestacaoConta;

    private LocalDate dtPrestacaoConta;

    @Column(length = 9)
    private String sqPrestacaoConta;

    @Column(length = 2)
    private String sqUf;

    @Column(length = 2)
    private String sqUe;

    @Column(length = 19)
    private String nmUe;

    @Column(length = 14)
    private String nrCnpjPrestadorConta;

    private Integer cdCargo;

    @Column(length = 17)
    private String dsCargo;

    @Column(length = 12)
    private Integer sqCandidato;

    @Column(length = 5)
    private String nrCandidato;

    private String nmCandidato;

    @Column(length = 11)
    private Integer nrCpfCandidato;

    @Column(length = 11)
    private Integer nrCpfViceCandidato;

    private Integer nrPartido;

    private String sgPartido;

    private String nmPartido;

    private Integer cdTipoFornecedor;

    @Column(length = 15)
    private String dsTipoFornecedor;

    private Integer cdCnaeFornecedor;

    private String dsCnaeFornecedor;

    @Column(length = 14)
    private String nrCpfCnpjFornecedor;

    private String nmFornecedor;

    private String nmFornecedorRfb;

    private Integer cdEsferaPartFornecedor;

    private String dsEsferaPartFornecedor;

    @Column(length = 2)
    private String sqUfFornecedor;

    private Integer cdMunicipioFornecedor;

    private String nmMunicipioFornecedor;

    private String sqCandidatoFornecedor;

    @Column(length = 5)
    private String nrCandidatoFornecedor;

    private Integer cdCargoFornecedor;

    private String dsCargoFornecedor;

    private Integer cdPartidoFornecedor;

    private String dsPartidoFornecedor;

    private Integer nrPartidoFornecedor;

    private String sgPartidoFornecedor;

    private String nmPartidoFornecedor;

    private String dsTipoDocumento;

    private String nrDocumento;

    private Integer cdOrigemDespesa;

    private String dsOrigemDespesa;

    @Column(length = 8)
    private String sqDespesa;

    private LocalDate dtDespesa;

    private Double vrDespesaContratada;

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

    public LocalTime getHhEleicao() {
        return hhEleicao;
    }

    public void setHhEleicao(LocalTime hhEleicao) {
        this.hhEleicao = hhEleicao;
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

    public Integer getStTurno() {
        return stTurno;
    }

    public void setStTurno(Integer stTurno) {
        this.stTurno = stTurno;
    }

    public String getTpPrestacaoConta() {
        return tpPrestacaoConta;
    }

    public void setTpPrestacaoConta(String tpPrestacaoConta) {
        this.tpPrestacaoConta = tpPrestacaoConta;
    }

    public LocalDate getDtPrestacaoConta() {
        return dtPrestacaoConta;
    }

    public void setDtPrestacaoConta(LocalDate dtPrestacaoConta) {
        this.dtPrestacaoConta = dtPrestacaoConta;
    }

    public String getSqPrestacaoConta() {
        return sqPrestacaoConta;
    }

    public void setSqPrestacaoConta(String sqPrestacaoConta) {
        this.sqPrestacaoConta = sqPrestacaoConta;
    }

    public String getSqUf() {
        return sqUf;
    }

    public void setSqUf(String sqUf) {
        this.sqUf = sqUf;
    }

    public String getSqUe() {
        return sqUe;
    }

    public void setSqUe(String sqUe) {
        this.sqUe = sqUe;
    }

    public String getNmUe() {
        return nmUe;
    }

    public void setNmUe(String nmUe) {
        this.nmUe = nmUe;
    }

    public String getNrCnpjPrestadorConta() {
        return nrCnpjPrestadorConta;
    }

    public void setNrCnpjPrestadorConta(String nrCnpjPrestadorConta) {
        this.nrCnpjPrestadorConta = nrCnpjPrestadorConta;
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

    public Integer getSqCandidato() {
        return sqCandidato;
    }

    public void setSqCandidato(Integer sqCandidato) {
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

    public Integer getNrCpfCandidato() {
        return nrCpfCandidato;
    }

    public void setNrCpfCandidato(Integer nrCpfCandidato) {
        this.nrCpfCandidato = nrCpfCandidato;
    }

    public Integer getNrCpfViceCandidato() {
        return nrCpfViceCandidato;
    }

    public void setNrCpfViceCandidato(Integer nrCpfViceCandidato) {
        this.nrCpfViceCandidato = nrCpfViceCandidato;
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

    public Integer getCdTipoFornecedor() {
        return cdTipoFornecedor;
    }

    public void setCdTipoFornecedor(Integer cdTipoFornecedor) {
        this.cdTipoFornecedor = cdTipoFornecedor;
    }

    public String getDsTipoFornecedor() {
        return dsTipoFornecedor;
    }

    public void setDsTipoFornecedor(String dsTipoFornecedor) {
        this.dsTipoFornecedor = dsTipoFornecedor;
    }

    public Integer getCdCnaeFornecedor() {
        return cdCnaeFornecedor;
    }

    public void setCdCnaeFornecedor(Integer cdCnaeFornecedor) {
        this.cdCnaeFornecedor = cdCnaeFornecedor;
    }

    public String getDsCnaeFornecedor() {
        return dsCnaeFornecedor;
    }

    public void setDsCnaeFornecedor(String dsCnaeFornecedor) {
        this.dsCnaeFornecedor = dsCnaeFornecedor;
    }

    public String getNrCpfCnpjFornecedor() {
        return nrCpfCnpjFornecedor;
    }

    public void setNrCpfCnpjFornecedor(String nrCpfCnpjFornecedor) {
        this.nrCpfCnpjFornecedor = nrCpfCnpjFornecedor;
    }

    public String getNmFornecedor() {
        return nmFornecedor;
    }

    public void setNmFornecedor(String nmFornecedor) {
        this.nmFornecedor = nmFornecedor;
    }

    public String getNmFornecedorRfb() {
        return nmFornecedorRfb;
    }

    public void setNmFornecedorRfb(String nmFornecedorRfb) {
        this.nmFornecedorRfb = nmFornecedorRfb;
    }

    public Integer getCdEsferaPartFornecedor() {
        return cdEsferaPartFornecedor;
    }

    public void setCdEsferaPartFornecedor(Integer cdEsferaPartFornecedor) {
        this.cdEsferaPartFornecedor = cdEsferaPartFornecedor;
    }

    public String getDsEsferaPartFornecedor() {
        return dsEsferaPartFornecedor;
    }

    public void setDsEsferaPartFornecedor(String dsEsferaPartFornecedor) {
        this.dsEsferaPartFornecedor = dsEsferaPartFornecedor;
    }

    public String getSqUfFornecedor() {
        return sqUfFornecedor;
    }

    public void setSqUfFornecedor(String sqUfFornecedor) {
        this.sqUfFornecedor = sqUfFornecedor;
    }

    public Integer getCdMunicipioFornecedor() {
        return cdMunicipioFornecedor;
    }

    public void setCdMunicipioFornecedor(Integer cdMunicipioFornecedor) {
        this.cdMunicipioFornecedor = cdMunicipioFornecedor;
    }

    public String getNmMunicipioFornecedor() {
        return nmMunicipioFornecedor;
    }

    public void setNmMunicipioFornecedor(String nmMunicipioFornecedor) {
        this.nmMunicipioFornecedor = nmMunicipioFornecedor;
    }

    public String getSqCandidatoFornecedor() {
        return sqCandidatoFornecedor;
    }

    public void setSqCandidatoFornecedor(String sqCandidatoFornecedor) {
        this.sqCandidatoFornecedor = sqCandidatoFornecedor;
    }

    public String getNrCandidatoFornecedor() {
        return nrCandidatoFornecedor;
    }

    public void setNrCandidatoFornecedor(String nrCandidatoFornecedor) {
        this.nrCandidatoFornecedor = nrCandidatoFornecedor;
    }

    public Integer getCdCargoFornecedor() {
        return cdCargoFornecedor;
    }

    public void setCdCargoFornecedor(Integer cdCargoFornecedor) {
        this.cdCargoFornecedor = cdCargoFornecedor;
    }

    public String getDsCargoFornecedor() {
        return dsCargoFornecedor;
    }

    public void setDsCargoFornecedor(String dsCargoFornecedor) {
        this.dsCargoFornecedor = dsCargoFornecedor;
    }

    public String getDsPartidoFornecedor() {
        return dsPartidoFornecedor;
    }

    public void setDsPartidoFornecedor(String dsPartidoFornecedor) {
        this.dsPartidoFornecedor = dsPartidoFornecedor;
    }

    public Integer getNrPartidoFornecedor() {
        return nrPartidoFornecedor;
    }

    public void setNrPartidoFornecedor(Integer nrPartidoFornecedor) {
        this.nrPartidoFornecedor = nrPartidoFornecedor;
    }

    public String getSgPartidoFornecedor() {
        return sgPartidoFornecedor;
    }

    public void setSgPartidoFornecedor(String sgPartidoFornecedor) {
        this.sgPartidoFornecedor = sgPartidoFornecedor;
    }

    public String getNmPartidoFornecedor() {
        return nmPartidoFornecedor;
    }

    public void setNmPartidoFornecedor(String nmPartidoFornecedor) {
        this.nmPartidoFornecedor = nmPartidoFornecedor;
    }

    public String getDsTipoDocumento() {
        return dsTipoDocumento;
    }

    public void setDsTipoDocumento(String dsTipoDocumento) {
        this.dsTipoDocumento = dsTipoDocumento;
    }

    public String getNrDocumento() {
        return nrDocumento;
    }

    public void setNrDocumento(String nrDocumento) {
        this.nrDocumento = nrDocumento;
    }

    public Integer getCdOrigemDespesa() {
        return cdOrigemDespesa;
    }

    public void setCdOrigemDespesa(Integer cdOrigemDespesa) {
        this.cdOrigemDespesa = cdOrigemDespesa;
    }

    public String getDsOrigemDespesa() {
        return dsOrigemDespesa;
    }

    public void setDsOrigemDespesa(String dsOrigemDespesa) {
        this.dsOrigemDespesa = dsOrigemDespesa;
    }

    public String getSqDespesa() {
        return sqDespesa;
    }

    public void setSqDespesa(String sqDespesa) {
        this.sqDespesa = sqDespesa;
    }

    public LocalDate getDtDespesa() {
        return dtDespesa;
    }

    public void setDtDespesa(LocalDate dtDespesa) {
        this.dtDespesa = dtDespesa;
    }

    public Double getVrDespesaContratada() {
        return vrDespesaContratada;
    }

    public void setVrDespesaContratada(Double vrDespesaContratada) {
        this.vrDespesaContratada = vrDespesaContratada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Objects.equals(id, ((DespesaCandidato)o).id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}