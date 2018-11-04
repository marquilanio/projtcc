package br.com.buonapizzaria.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.buonapizzaria.entidades.Mesa;
import br.com.buonapizzaria.entidades.Produto;

public class ProdutoDAO {
	
	private Connection con = Conexao.getConnection();
	
	public void cadastrar(Produto produto) {
		
		String sql = "INSERT INTO PRODUTO (descricaoproduto, numerofatiasproduto, unidademedidaproduto, precounitarioproduto, tipofabricacaoproduto, datafabricacaoproduto, validadeprodutodias, fornecedorproduto, informacoesgeraisproduto) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		//Constroe o PreparedStatement com o SQL
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, produto.getDescricaoProduto());
			preparador.setInt(2, produto.getNumeroFatiasProduto());
			preparador.setString(3, produto.getUnidadeMedidaProduto());
			preparador.setDouble(4, produto.getPrecoUnitarioProduto());
			preparador.setString(5, produto.getTipoFabricacaoProduto());
			preparador.setDate(6, produto.getDataFabricacaoProduto());
			preparador.setInt(7, produto.getValidadeProdutoEmDias());
			preparador.setString(8, produto.getFornecedorProduto());
			preparador.setString(9, produto.getInformacoesGeraisProduto());
						
			preparador.execute();
			preparador.close();
			
			System.out.println("Produto cadastrado com sucesso!");
			
		} catch (SQLException e) {
			System.out.println("Erro ao cadastrar um novo Produto");
		}
	}
	
	
	public void alterar(Produto produto) {
		
		String sql = "UPDATE PRODUTO SET descricaoproduto=?, numerofatiasproduto=?, unidademedidaproduto=?, precounitarioproduto=?, tipofabricacaoproduto=?, datafabricacaoproduto=?, validadeprodutodias=?, fornecedorproduto=?, informacoesgeraisproduto=? WHERE idproduto=?";
	
		//Constroe o PreparedStatement com o SQL
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, produto.getDescricaoProduto());
			preparador.setInt(2, produto.getNumeroFatiasProduto());
			preparador.setString(3, produto.getUnidadeMedidaProduto());
			preparador.setDouble(4, produto.getPrecoUnitarioProduto());
			preparador.setString(5, produto.getTipoFabricacaoProduto());
			preparador.setDate(6, produto.getDataFabricacaoProduto());
			preparador.setInt(7, produto.getValidadeProdutoEmDias());
			preparador.setString(8, produto.getFornecedorProduto());
			preparador.setString(9, produto.getInformacoesGeraisProduto());
			preparador.setInt(10, produto.getIdProduto());
		
			preparador.execute();
			preparador.close();
			
			System.out.println("Produto alterado com sucesso!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	
	public void salvar(Produto produto) {
		if(produto.getIdProduto()!=null && produto.getIdProduto()!=0) {
			alterar(produto);
		}
		else {
			cadastrar(produto);
		}
	}
	
	
	public void excluir(Produto produto) {
		
		String sql = "DELETE FROM PRODUTO WHERE idproduto=?";
	
		//Constroe o PreparedStatement com o SQL
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, produto.getIdProduto());
			
			preparador.execute();
			preparador.close();
			
			System.out.println("O Produto Nº " + produto.getIdProduto() + " excluido com sucesso!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	
public List<Produto> buscarTodos() {
		
		String sql = "SELECT * FROM  PRODUTO";
		
		List<Produto> lista = new ArrayList<Produto>();
	
		//Constroe o PreparedStatement com o SQL
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			
			ResultSet resultado = preparador.executeQuery();
			
			while(resultado.next()) {
				
				Produto prod = new Produto();
				
				//o resultado armazena todo o valor das colunas
				prod.setIdProduto(resultado.getInt("idproduto"));
				prod.setDescricaoProduto(resultado.getString("descricaoproduto"));
				prod.setNumeroFatiasProduto(resultado.getInt("numerofatiasproduto"));
				prod.setUnidadeMedidaProduto(resultado.getString("unidademedidaproduto"));
				prod.setPrecoUnitarioProduto(resultado.getDouble("precounitarioproduto"));
				prod.setTipoFabricacaoProduto(resultado.getString("tipofabricacaoproduto"));
				prod.setDataFabricacaoProduto(resultado.getDate("datafabricacaoproduto"));
				prod.setValidadeProdutoEmDias(resultado.getInt("validadeprodutodias"));
				prod.setFornecedorProduto(resultado.getString("fornecedorproduto"));
				prod.setInformacoesGeraisProduto(resultado.getString("informacoesgeraisproduto"));
						
				lista.add(prod);			
			}
			
			preparador.close();	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		return lista;
	}

}
