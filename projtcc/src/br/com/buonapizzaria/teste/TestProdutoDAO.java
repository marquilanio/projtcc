package br.com.buonapizzaria.teste;

import java.util.List;
import br.com.buonapizzaria.entidades.Produto;
import br.com.buonapizzaria.jdbc.ProdutoDAO;

public class TestProdutoDAO {

	public static void main(String[] args) {
		
		//TestCadastrar();
		//TestAlterar();
		//TestExcluir();
		TestBuscarTodos();
	}

	private static void TestCadastrar() {
		
		FormatarData f = new FormatarData();
		String data = "21/10/2018";
		data = f.formataDataJdbc(data);
		
		java.sql.Date dtConv = java.sql.Date.valueOf(data);
			
		Produto prod = new Produto();
		prod.setDescricaoProduto("Pizza Mussarela Média");
		prod.setNumeroFatiasProduto(8);
		prod.setUnidadeMedidaProduto("UN");
		prod.setPrecoUnitarioProduto(39.90);
		prod.setTipoFabricacaoProduto("Artesanal");
		prod.setDataFabricacaoProduto(dtConv);
		prod.setValidadeProdutoEmDias(1);
		prod.setFornecedorProduto("Pizza da Casa");
		prod.setInformacoesGeraisProduto("Consumir no máximo em 1 dia");
		
		ProdutoDAO prodDAO = new ProdutoDAO();
		prodDAO.cadastrar(prod);
		
	}
	
	
	private static void TestAlterar() {
		
		FormatarData f = new FormatarData();
		String data = "21/10/2018";
		data = f.formataDataJdbc(data);
	
		java.sql.Date dtConv = java.sql.Date.valueOf(data);
		
		Produto prod = new Produto();
		prod.setIdProduto(2);
		prod.setDescricaoProduto("Pizza Mussarela Média");
		prod.setNumeroFatiasProduto(6);
		prod.setUnidadeMedidaProduto("UN");
		prod.setPrecoUnitarioProduto(39.90);
		prod.setTipoFabricacaoProduto("Artesanal");
		prod.setDataFabricacaoProduto(dtConv);
		prod.setValidadeProdutoEmDias(1);
		prod.setFornecedorProduto("Pizza da Casa");
		prod.setInformacoesGeraisProduto("Consumir no máximo em 1 dia");
		
		ProdutoDAO prodDAO = new ProdutoDAO();
		prodDAO.alterar(prod);
	}
	
	
	private static void TestExcluir() {
		
		Produto prod = new Produto();
		prod.setIdProduto(4);
		
		ProdutoDAO prodDAO = new ProdutoDAO();
		prodDAO.excluir(prod);
		
	}
	
	
	private static void TestBuscarTodos() {
		
		ProdutoDAO prodDAO = new ProdutoDAO();
		List<Produto> listaResultado = prodDAO.buscarTodos();
		
			for(Produto u: listaResultado) {
				System.out.println(u.getIdProduto() + " " + u.getDescricaoProduto()  + " " + u.getPrecoUnitarioProduto() + " " + u.getTipoFabricacaoProduto());
			}
	}
	

}
