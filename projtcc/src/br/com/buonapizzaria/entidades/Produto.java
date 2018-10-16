package br.com.buonapizzaria.entidades;

import java.math.BigDecimal;
import java.sql.Date;

public class Produto {
	
	private Integer idProduto;
	private String descricaoProduto;
	private Integer numeroFatiasProduto;
	private String unidadeMedidaProduto;
	private BigDecimal precoUnitarioProduto; 
	private String tipoFabricacaoProduto; 
	private Date dataFabricacaoProduto; 
	private Integer ValidadeProdutoEmDias; 
	private String fornecedorProduto; 
	private String InformacoesGeraisProduto;

	public Integer getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}
	public String getDescricaoProduto() {
		return descricaoProduto;
	}
	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}
	public Integer getNumeroFatiasProduto() {
		return numeroFatiasProduto;
	}
	public void setNumeroFatiasProduto(Integer numeroFatiasProduto) {
		this.numeroFatiasProduto = numeroFatiasProduto;
	}
	public String getUnidadeMedidaProduto() {
		return unidadeMedidaProduto;
	}
	public void setUnidadeMedidaProduto(String unidadeMedidaProduto) {
		this.unidadeMedidaProduto = unidadeMedidaProduto;
	}
	public BigDecimal getPrecoUnitarioProduto() {
		return precoUnitarioProduto;
	}
	public void setPrecoUnitarioProduto(BigDecimal precoUnitarioProduto) {
		this.precoUnitarioProduto = precoUnitarioProduto;
	}
	public String getTipoFabricacaoProduto() {
		return tipoFabricacaoProduto;
	}
	public void setTipoFabricacaoProduto(String tipoFabricacaoProduto) {
		this.tipoFabricacaoProduto = tipoFabricacaoProduto;
	}
	public Date getDataFabricacaoProduto() {
		return dataFabricacaoProduto;
	}
	public void setDataFabricacaoProduto(Date dataFabricacaoProduto) {
		this.dataFabricacaoProduto = dataFabricacaoProduto;
	}
	public Integer getValidadeProdutoEmDias() {
		return ValidadeProdutoEmDias;
	}
	public void setValidadeProdutoEmDias(Integer validadeProdutoEmDias) {
		ValidadeProdutoEmDias = validadeProdutoEmDias;
	}
	public String getFornecedorProduto() {
		return fornecedorProduto;
	}
	public void setFornecedorProduto(String fornecedorProduto) {
		this.fornecedorProduto = fornecedorProduto;
	}
	public String getInformacoesGeraisProduto() {
		return InformacoesGeraisProduto;
	}
	public void setInformacoesGeraisProduto(String informacoesGeraisProduto) {
		InformacoesGeraisProduto = informacoesGeraisProduto;
	}
}
