package br.com.buonapizzaria.entidades;

import java.sql.Date;

public class Funcionario extends Pessoa {
	
	private Integer idFuncionario;
	private String nomeFuncionario;
	private String cpfFuncionario;
	private String rgFuncionario;
	private Date dataFuncionario; 
	private String EnderecoFuncionario; 
	private String cidadeFuncionario; 
	private String cepFuncionario;
	private String cargoFuncionario;
	private String tipoContratacaoFuncionario;
	private String escolaridadeFuncionario;
	private String loginFuncionario; 
	private String senhaFuncionario;
	private String codigoClienteFuncionario;
	
	public Integer getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public String getCpfFuncionario() {
		return cpfFuncionario;
	}
	public void setCpfFuncionario(String cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}
	public String getRgFuncionario() {
		return rgFuncionario;
	}
	public void setRgFuncionario(String rgFuncionario) {
		this.rgFuncionario = rgFuncionario;
	}
	public Date getDataFuncionario() {
		return dataFuncionario;
	}
	public void setDataFuncionario(Date dataFuncionario) {
		this.dataFuncionario = dataFuncionario;
	}
	public String getEnderecoFuncionario() {
		return EnderecoFuncionario;
	}
	public void setEnderecoFuncionario(String enderecoFuncionario) {
		EnderecoFuncionario = enderecoFuncionario;
	}
	public String getCidadeFuncionario() {
		return cidadeFuncionario;
	}
	public void setCidadeFuncionario(String cidadeFuncionario) {
		this.cidadeFuncionario = cidadeFuncionario;
	}
	public String getCepFuncionario() {
		return cepFuncionario;
	}
	public void setCepFuncionario(String cepFuncionario) {
		this.cepFuncionario = cepFuncionario;
	}
	public String getCargoFuncionario() {
		return cargoFuncionario;
	}
	public void setCargoFuncionario(String cargoFuncionario) {
		this.cargoFuncionario = cargoFuncionario;
	}
	public String getTipoContratacaoFuncionario() {
		return tipoContratacaoFuncionario;
	}
	public void setTipoContratacaoFuncionario(String tipoContratacaoFuncionario) {
		this.tipoContratacaoFuncionario = tipoContratacaoFuncionario;
	}
	public String getEscolaridadeFuncionario() {
		return escolaridadeFuncionario;
	}
	public void setEscolaridadeFuncionario(String escolaridadeFuncionario) {
		this.escolaridadeFuncionario = escolaridadeFuncionario;
	}
	public String getLoginFuncionario() {
		return loginFuncionario;
	}
	public void setLoginFuncionario(String loginFuncionario) {
		this.loginFuncionario = loginFuncionario;
	}
	public String getSenhaFuncionario() {
		return senhaFuncionario;
	}
	public void setSenhaFuncionario(String senhaFuncionario) {
		this.senhaFuncionario = senhaFuncionario;
	}
	public String getCodigoClienteFuncionario() {
		return codigoClienteFuncionario;
	}
	public void setCodigoClienteFuncionario(String codigoClienteFuncionario) {
		this.codigoClienteFuncionario = codigoClienteFuncionario;
	}
}
