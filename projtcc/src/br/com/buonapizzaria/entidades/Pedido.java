package br.com.buonapizzaria.entidades;

import java.sql.Date;

public class Pedido {
	
	private Integer idPedido;
	private Integer idClientePedido;
	private Integer idFuncionarioPedido;
	private Integer idMesa;
	private Date dataPedido;
	private String tipoPedido;
	private String formaPagamentoPedido;
	private Double percentualDescontoPedido;
	private Double taxaEntregaPedido;
	private Double valorTotalPedido;
	private String statusPedido;
	private String informacoesGeraisPedido;
	
	public Integer getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}
	public Integer getIdClientePedido() {
		return idClientePedido;
	}
	public void setIdClientePedido(Integer idClientePedido) {
		this.idClientePedido = idClientePedido;
	}
	public Integer getIdFuncionarioPedido() {
		return idFuncionarioPedido;
	}
	public void setIdFuncionarioPedido(Integer idFuncionarioPedido) {
		this.idFuncionarioPedido = idFuncionarioPedido;
	}
	public Integer getIdMesa() {
		return idMesa;
	}
	public void setIdMesa(Integer idMesa) {
		this.idMesa = idMesa;
	}
	public Date getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	public String getTipoPedido() {
		return tipoPedido;
	}
	public void setTipoPedido(String tipoPedido) {
		this.tipoPedido = tipoPedido;
	}
	public String getFormaPagamentoPedido() {
		return formaPagamentoPedido;
	}
	public void setFormaPagamentoPedido(String formaPagamentoPedido) {
		this.formaPagamentoPedido = formaPagamentoPedido;
	}
	public Double getPercentualDescontoPedido() {
		return percentualDescontoPedido;
	}
	public void setPercentualDescontoPedido(Double percentualDescontoPedido) {
		this.percentualDescontoPedido = percentualDescontoPedido;
	}
	public Double getTaxaEntregaPedido() {
		return taxaEntregaPedido;
	}
	public void setTaxaEntregaPedido(Double taxaEntregaPedido) {
		this.taxaEntregaPedido = taxaEntregaPedido;
	}
	public Double getValorTotalPedido() {
		return valorTotalPedido;
	}
	public void setValorTotalPedido(Double valorTotalPedido) {
		this.valorTotalPedido = valorTotalPedido;
	}
	public String getStatusPedido() {
		return statusPedido;
	}
	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}
	public String getInformacoesGeraisPedido() {
		return informacoesGeraisPedido;
	}
	public void setInformacoesGeraisPedido(String informacoesGeraisPedido) {
		this.informacoesGeraisPedido = informacoesGeraisPedido;
	}
	
}
