package br.com.buonapizzaria.entidades;

import java.sql.Date;

public abstract class Pessoa {
	
	private Integer idPessoa;
	private String nomePessoa;
	private String cpfPessoa;
	private String rgPessoa;
	private Date dataNascimentoPessoa; 
	private String EnderecoPessoa; 
	private String cidadePessoa; 
	private String cepPessoa; 
	private String loginPessoa; 
	private String senhaPessoa;

	
	public Integer getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public String getCpfPessoa() {
		return cpfPessoa;
	}
	public void setCpfPessoa(String cpfPessoa) {
		this.cpfPessoa = cpfPessoa;
	}
	public String getRgPessoa() {
		return rgPessoa;
	}
	public void setRgPessoa(String rgPessoa) {
		this.rgPessoa = rgPessoa;
	}
	public Date getDataNascimentoPessoa() {
		return dataNascimentoPessoa;
	}
	public void setDataNascimentoPessoa(Date dataNascimentoPessoa) {
		this.dataNascimentoPessoa = dataNascimentoPessoa;
	}
	public String getEnderecoPessoa() {
		return EnderecoPessoa;
	}
	public void setEnderecoPessoa(String enderecoPessoa) {
		EnderecoPessoa = enderecoPessoa;
	}
	public String getCidadePessoa() {
		return cidadePessoa;
	}
	public void setCidadePessoa(String cidadePessoa) {
		this.cidadePessoa = cidadePessoa;
	}
	public String getCepPessoa() {
		return cepPessoa;
	}
	public void setCepPessoa(String cepPessoa) {
		this.cepPessoa = cepPessoa;
	}
	public String getLoginPessoa() {
		return loginPessoa;
	}
	public void setLoginPessoa(String loginPessoa) {
		this.loginPessoa = loginPessoa;
	}
	public String getSenhaPessoa() {
		return senhaPessoa;
	}
	public void setSenhaPessoa(String senhaPessoa) {
		this.senhaPessoa = senhaPessoa;
	}
	
	//public abstract String cadastrar();
	
}
