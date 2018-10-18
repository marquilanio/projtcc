package br.com.buonapizzaria.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.buonapizzaria.entidades.Cliente;

public class ClienteDAO {
	
	private Connection con = Conexao.getConnection();
	
	public void cadastrar(Cliente cliente) {
		
		String sql = "INSERT INTO CLIENTE (nomecliente, cpfcliente, rgcliente, datanascimentocliente, enderecocliente, cidadecliente, cepcliente, logincliente, senhacliente) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
		//Constroe o PreparedStatement com o SQL
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, cliente.getNomeCliente());
			preparador.setString(2, cliente.getCpfCliente());
			preparador.setString(3, cliente.getRgCliente());
			preparador.setDate(4, (Date)cliente.getDataNascimentoCliente());
			preparador.setString(5, cliente.getEnderecoCliente());
			preparador.setString(6, cliente.getCidadeCliente());
			preparador.setString(7, cliente.getCepCliente());
			preparador.setString(8, cliente.getLoginCliente());
			preparador.setString(9, cliente.getSenhaCliente());
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Cliente cadastrado com sucesso!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	
	public void alterar(Cliente cliente) {
		
		String sql = "UPDATE CLIENTE SET nomecliente=?, cpfcliente=?, rgcliente=?, datanascimentocliente=?, enderecocliente=?, cidadecliente=?, cepcliente=?, logincliente=?, senhacliente=? WHERE idcliente=?";
	
		//Constroe o PreparedStatement com o SQL
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, cliente.getNomeCliente());
			preparador.setString(2, cliente.getCpfCliente());
			preparador.setString(3, cliente.getRgCliente());
			preparador.setDate(4, cliente.getDataNascimentoPessoa());
			preparador.setString(5, cliente.getEnderecoCliente());
			preparador.setString(6, cliente.getCidadeCliente());
			preparador.setString(7, cliente.getCepCliente());
			preparador.setString(8, cliente.getLoginCliente());
			preparador.setString(9, cliente.getSenhaCliente());
			preparador.setInt(10, cliente.getIdCliente());
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Cliente alterado com sucesso!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	
	public void excluir(Cliente cliente) {
		
		String sql = "DELETE FROM CLIENTE WHERE idcliente=?";
	
		//Constroe o PreparedStatement com o SQL
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, cliente.getIdCliente());
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Cliente Nº " + cliente.getIdCliente() + " excluido com sucesso!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	
	
	public List<Cliente> buscarTodos() {
		
		String sql = "SELECT * FROM  CLIENTE";
		
		List<Cliente> lista = new ArrayList<Cliente>();
	
		//Constroe o PreparedStatement com o SQL
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			
			ResultSet resultado = preparador.executeQuery();
			
			while(resultado.next()) {
				
				Cliente cli = new Cliente();
				
				//o resultado armazena todo o valor das colunas
				cli.setIdCliente(resultado.getInt("idcliente")); 
				cli.setNomeCliente(resultado.getString("nomecliente"));
				cli.setCpfCliente(resultado.getString("cpfcliente"));
				cli.setRgCliente(resultado.getString("rgcliente"));
				cli.setDataNascimentoCliente(resultado.getDate("datanascimentocliente"));
				cli.setEnderecoCliente(resultado.getString("enderecocliente"));
				cli.setCidadeCliente(resultado.getString("cidadecliente"));
				cli.setCepCliente(resultado.getString("cepcliente"));
				cli.setLoginCliente(resultado.getString("logincliente"));
				cli.setSenhaCliente(resultado.getString("senhacliente"));
				
				lista.add(cli);
				
			}
			
			preparador.close();	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		return lista;
	}


}
