package br.com.buonapizzaria.entidades;

public class Pagamento {
	
	private Integer idPagamento;
	private String descricaoPagamento;
	private String bandeiraCartaoPagamento;
	private Integer codigoPedidoPagamento; 
	private Integer codigoFuncionarioPagamento; 
	private Integer codigoClientePagamento; 
	private Integer codigoMesaPagamento;
	private String statusPagamento;
	private Boolean DescontoPagamento;
	private String informacoesGeraisPagamento;
	
	public Integer getIdPagamento() {
		return idPagamento;
	}
	public void setIdPagamento(Integer idPagamento) {
		this.idPagamento = idPagamento;
	}
	public String getDescricaoPagamento() {
		return descricaoPagamento;
	}
	public void setDescricaoPagamento(String descricaoPagamento) {
		this.descricaoPagamento = descricaoPagamento;
	}
	public String getBandeiraCartaoPagamento() {
		return bandeiraCartaoPagamento;
	}
	public void setBandeiraCartaoPagamento(String bandeiraCartaoPagamento) {
		this.bandeiraCartaoPagamento = bandeiraCartaoPagamento;
	}
	public Integer getCodigoPedidoPagamento() {
		return codigoPedidoPagamento;
	}
	public void setCodigoPedidoPagamento(Integer codigoPedidoPagamento) {
		this.codigoPedidoPagamento = codigoPedidoPagamento;
	}
	public Integer getCodigoFuncionarioPagamento() {
		return codigoFuncionarioPagamento;
	}
	public void setCodigoFuncionarioPagamento(Integer codigoFuncionarioPagamento) {
		this.codigoFuncionarioPagamento = codigoFuncionarioPagamento;
	}
	public Integer getCodigoClientePagamento() {
		return codigoClientePagamento;
	}
	public void setCodigoClientePagamento(Integer codigoClientePagamento) {
		this.codigoClientePagamento = codigoClientePagamento;
	}
	public Integer getCodigoMesaPagamento() {
		return codigoMesaPagamento;
	}
	public void setCodigoMesaPagamento(Integer codigoMesaPagamento) {
		this.codigoMesaPagamento = codigoMesaPagamento;
	}
	public String getStatusPagamento() {
		return statusPagamento;
	}
	public void setStatusPagamento(String statusPagamento) {
		this.statusPagamento = statusPagamento;
	}
	public Boolean getDescontoPagamento() {
		return DescontoPagamento;
	}
	public void setDescontoPagamento(Boolean descontoPagamento) {
		DescontoPagamento = descontoPagamento;
	}
	public String getInformacoesGeraisPagamento() {
		return informacoesGeraisPagamento;
	}
	public void setInformacoesGeraisPagamento(String informacoesGeraisPagamento) {
		this.informacoesGeraisPagamento = informacoesGeraisPagamento;
	}
}