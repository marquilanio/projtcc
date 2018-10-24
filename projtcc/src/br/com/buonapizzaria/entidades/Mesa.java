package br.com.buonapizzaria.entidades;

import java.sql.Date;

public class Mesa {
	
	private Integer idMesa;
	private String descricaoMesa;
	private String localMesa;
	private Integer areaMesa;
	private Integer numeroPessoasMesa;
	private String statusMesa;
	private String fomatoMesa;
	private String corMesa;
	private Date dataCompraMesa;
	private Integer codigoAtendenteFuncionario;
	
	public Integer getIdMesa() {
		return idMesa;
	}
	public void setIdMesa(Integer idMesa) {
		this.idMesa = idMesa;
	}
	public String getDescricaoMesa() {
		return descricaoMesa;
	}
	public void setDescricaoMesa(String descricaoMesa) {
		this.descricaoMesa = descricaoMesa;
	}
	public String getLocalMesa() {
		return localMesa;
	}
	public void setLocalMesa(String localMesa) {
		this.localMesa = localMesa;
	}
	public Integer getAreaMesa() {
		return areaMesa;
	}
	public void setAreaMesa(Integer areaMesa) {
		this.areaMesa = areaMesa;
	}
	public Integer getNumeroPessoasMesa() {
		return numeroPessoasMesa;
	}
	public void setNumeroPessoasMesa(Integer numeroPessoasMesa) {
		this.numeroPessoasMesa = numeroPessoasMesa;
	}
	public String getStatusMesa() {
		return statusMesa;
	}
	public void setStatusMesa(String statusMesa) {
		this.statusMesa = statusMesa;
	}
	public String getFomatoMesa() {
		return fomatoMesa;
	}
	public void setFomatoMesa(String fomatoMesa) {
		this.fomatoMesa = fomatoMesa;
	}
	public String getCorMesa() {
		return corMesa;
	}
	public void setCorMesa(String corMesa) {
		this.corMesa = corMesa;
	}
	public Date getDataCompraMesa() {
		return dataCompraMesa;
	}
	public void setDataCompraMesa(Date dataCompraMesa) {
		this.dataCompraMesa = dataCompraMesa;
	}
	public Integer getCodigoAtendenteFuncionario() {
		return codigoAtendenteFuncionario;
	}
	public void setCodigoAtendenteFuncionario(Integer codigoAtendenteFuncionario) {
		this.codigoAtendenteFuncionario = codigoAtendenteFuncionario;
	}

}
