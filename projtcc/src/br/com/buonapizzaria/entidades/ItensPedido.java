package br.com.buonapizzaria.entidades;

public class ItensPedido {
	
	private Integer idItemPedido;
	private Integer idPedido;
	private Integer idProduto;
	private Integer quantidadeItem;
	private Double aliquotaIcmsItem;
	private Double percentualDescontoItem;
	private Double taxaServicoItem;
	
	public Integer getIdItemPedido() {
		return idItemPedido;
	}
	public void setIdItemPedido(Integer idItemPedido) {
		this.idItemPedido = idItemPedido;
	}
	public Integer getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}
	public Integer getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}
	public Integer getQuantidadeItem() {
		return quantidadeItem;
	}
	public void setQuantidadeItem(Integer quantidadeItem) {
		this.quantidadeItem = quantidadeItem;
	}
	public Double getAliquotaIcmsItem() {
		return aliquotaIcmsItem;
	}
	public void setAliquotaIcmsItem(Double aliquotaIcmsItem) {
		this.aliquotaIcmsItem = aliquotaIcmsItem;
	}
	public Double getPercentualDescontoItem() {
		return percentualDescontoItem;
	}
	public void setPercentualDescontoItem(Double percentualDescontoItem) {
		this.percentualDescontoItem = percentualDescontoItem;
	}
	public Double getTaxaServicoItem() {
		return taxaServicoItem;
	}
	public void setTaxaServicoItem(Double taxaServicoItem) {
		this.taxaServicoItem = taxaServicoItem;
	}

}
