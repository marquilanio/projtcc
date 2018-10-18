package br.com.buonapizzaria.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.buonapizzaria.entidades.Cliente;
import br.com.buonapizzaria.entidades.Entregador;

public class EntregadorDAO {

private Connection con = Conexao.getConnection();
	
	public void cadastrar(Entregador entregador) {
		
		String sql = "INSERT INTO ENTREGADOR (nomeentregador, cpfentregador, datanascimentoentregador, enderecoentregador, cidadeentregador, cepentregador, fonecontato, categoriahabilitacaoentregador, numerohabilitacaoentregador) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		//Constroe o PreparedStatement com o SQL
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, entregador.getNomeEntregador());
			preparador.setString(2, entregador.getCpfEntregador());
			preparador.setDate(3, entregador.getDataNascimentoEntregador());
			preparador.setString(4, entregador.getEnderecoEntregador());
			preparador.setString(5, entregador.getCidadeEntregador());
			preparador.setString(6, entregador.getCepEntregador());
			preparador.setString(7, entregador.getFoneContatoEntregador());
			preparador.setString(8, entregador.getCategoriaHabilitacaoEntregador());
			preparador.setString(9, entregador.getNumeroHabilitacaoEntregador());
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Entregador cadastrado com sucesso!");
			
		} catch (SQLException e) {
			System.out.println("Erro ao cadastrar um novo Entregador");
		}	
	}
	
	public void alterar(Entregador entregador) {
		
		String sql = "UPDATE ENTREGADOR SET nomeentregador=?, cpfentregador=?, datanascimentoentregador=?, enderecoentregador=?, cidadeentregador=?, cepentregador=?, fonecontato=?, categoriahabilitacaoentregador=?, numerohabilitacaoentregador=? WHERE identregador=?";
	
		//Constroe o PreparedStatement com o SQL
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, entregador.getNomeEntregador());
			preparador.setString(2, entregador.getCpfEntregador());
			preparador.setDate(3, entregador.getDataNascimentoEntregador());
			preparador.setString(4, entregador.getEnderecoEntregador());
			preparador.setString(5, entregador.getCidadeEntregador());
			preparador.setString(6, entregador.getCepEntregador());
			preparador.setString(7, entregador.getFoneContatoEntregador());
			preparador.setString(8, entregador.getCategoriaHabilitacaoEntregador());
			preparador.setString(9, entregador.getNumeroHabilitacaoEntregador());
			preparador.setInt(10, entregador.getIdEntregador());
		
			preparador.execute();
			preparador.close();
			
			System.out.println("Entregador alterado com sucesso!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	
	public void excluir(Entregador entregador) {
		
		String sql = "DELETE FROM ENTREGADOR WHERE identregador=?";
	
		//Constroe o PreparedStatement com o SQL
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, entregador.getIdEntregador());
			
			preparador.execute();
			preparador.close();
			
			System.out.println("O Entregador Nº " + entregador.getIdEntregador() + " excluido com sucesso!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	
	public List<Entregador> buscarTodos() {
		
		String sql = "SELECT * FROM  ENTREGADOR";
		
		List<Entregador> lista = new ArrayList<Entregador>();
	
		//Constroe o PreparedStatement com o SQL
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			
			ResultSet resultado = preparador.executeQuery();
			
			while(resultado.next()) {
				
				Entregador entr = new Entregador();
				
				//o resultado armazena todo o valor das colunas
				entr.setIdEntregador(resultado.getInt("identregador"));
				entr.setNomeEntregador(resultado.getString("nomeentregador"));
				entr.setCpfEntregador(resultado.getString("cpfentregador"));
				entr.setDataNascimentoEntregador(resultado.getDate("datanascimentoentregador"));
				entr.setEnderecoEntregador(resultado.getString("enderecoentregador"));
				entr.setCidadeEntregador(resultado.getString("cidadeentregador"));
				entr.setCepEntregador(resultado.getString("cepentregador"));
				entr.setFoneContatoEntregador(resultado.getString("fonecontato"));
				entr.setCategoriaHabilitacaoEntregador(resultado.getString("categoriahabilitacaoentregador"));
				entr.setNumeroHabilitacaoEntregador(resultado.getString("numerohabilitacaoentregador"));
				
				lista.add(entr);
				
			}
			
			preparador.close();	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		return lista;
	}


	
	
}
