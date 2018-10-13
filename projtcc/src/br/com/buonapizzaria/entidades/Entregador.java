package br.com.buonapizzaria.entidades;

import java.sql.Date;

public class Entregador extends Pessoa {
	
	private Integer idEntregador;
	private String nomeEntregador;
	private String cpfEntregador;
	private Date dataNascimentoEntregador; 
	private String enderecoEntregador; 
	private String cidadeEntregador; 
	private String cepEntregador;
	private String foneContato;
	private String categoriaHabilitacaoEntregador;
	private String numeroHabilitacaoEntregador;
	
	public Integer getIdEntregador() {
		return idEntregador;
	}
	public void setIdEntregador(Integer idEntregador) {
		this.idEntregador = idEntregador;
	}
	public String getNomeEntregador() {
		return nomeEntregador;
	}
	public void setNomeEntregador(String nomeEntregador) {
		this.nomeEntregador = nomeEntregador;
	}
	public String getCpfEntregador() {
		return cpfEntregador;
	}
	public void setCpfEntregador(String cpfEntregador) {
		this.cpfEntregador = cpfEntregador;
	}
	public Date getDataNascimentoEntregador() {
		return dataNascimentoEntregador;
	}
	public void setDataNascimentoEntregador(Date dataNascimentoEntregador) {
		this.dataNascimentoEntregador = dataNascimentoEntregador;
	}
	public String getEnderecoEntregador() {
		return enderecoEntregador;
	}
	public void setEnderecoEntregador(String enderecoEntregador) {
		this.enderecoEntregador = enderecoEntregador;
	}
	public String getCidadeEntregador() {
		return cidadeEntregador;
	}
	public void setCidadeEntregador(String cidadeEntregador) {
		this.cidadeEntregador = cidadeEntregador;
	}
	public String getCepEntregador() {
		return cepEntregador;
	}
	public void setCepEntregador(String cepEntregador) {
		this.cepEntregador = cepEntregador;
	}
	public String getFoneContato() {
		return foneContato;
	}
	public void setFoneContato(String foneContato) {
		this.foneContato = foneContato;
	}
	public String getCategoriaHabilitacaoEntregador() {
		return categoriaHabilitacaoEntregador;
	}
	public void setCategoriaHabilitacaoEntregador(String categoriaHabilitacaoEntregador) {
		this.categoriaHabilitacaoEntregador = categoriaHabilitacaoEntregador;
	}
	public String getNumeroHabilitacaoEntregador() {
		return numeroHabilitacaoEntregador;
	}
	public void setNumeroHabilitacaoEntregador(String numeroHabilitacaoEntregador) {
		this.numeroHabilitacaoEntregador = numeroHabilitacaoEntregador;
	}
}
