package br.com.buonapizzaria.entidades;

import java.util.Date;

public class Cliente extends Pessoa {
	
	private Integer idCliente;
	private String nomeCliente;
	private String cpfCliente;
	private String rgCliente;
	private Date dataNascimentoCliente; 
	private String enderecoCliente; 
	private String cidadeCliente; 
	private String cepCliente; 
	private String loginCliente; 
	private String senhaCliente;
	
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public String getRgCliente() {
		return rgCliente;
	}
	public void setRgCliente(String rgCliente) {
		this.rgCliente = rgCliente;
	}
	public Date getDataNascimentoCliente() {
		return dataNascimentoCliente;
	}
	public void setDataNascimentoCliente(Date dtConv) {
		this.dataNascimentoCliente = dtConv;
	}
	public String getEnderecoCliente() {
		return enderecoCliente;
	}
	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	public String getCidadeCliente() {
		return cidadeCliente;
	}
	public void setCidadeCliente(String cidadeCliente) {
		this.cidadeCliente = cidadeCliente;
	}
	public String getCepCliente() {
		return cepCliente;
	}
	public void setCepCliente(String cepCliente) {
		this.cepCliente = cepCliente;
	}
	public String getLoginCliente() {
		return loginCliente;
	}
	public void setLoginCliente(String loginCliente) {
		this.loginCliente = loginCliente;
	}
	public String getSenhaCliente() {
		return senhaCliente;
	}
	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}
}
