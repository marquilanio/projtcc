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
	
	
	public void salvar(Cliente cliente) {
		if(cliente.getIdCliente()!=null && cliente.getIdCliente()!=0) {
			alterar(cliente);
		}
		else {
			cadastrar(cliente);
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
	
	
	public Cliente buscarPorId(Integer id) {
		
		String sql = "SELECT * FROM CLIENTE WHERE idcliente=?";
		
		Cliente cliente = null;
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, id);
			
			ResultSet resultado = preparador.executeQuery();
			
			if (resultado.next()) {
				cliente = new Cliente();
				cliente.setIdCliente(resultado.getInt("idcliente")); 
				cliente.setNomeCliente(resultado.getString("nomecliente"));
				cliente.setCpfCliente(resultado.getString("cpfcliente"));
				cliente.setRgCliente(resultado.getString("rgcliente"));
				cliente.setDataNascimentoCliente(resultado.getDate("datanascimentocliente"));
				cliente.setEnderecoCliente(resultado.getString("enderecocliente"));
				cliente.setCidadeCliente(resultado.getString("cidadecliente"));
				cliente.setCepCliente(resultado.getString("cepcliente"));
				cliente.setLoginCliente(resultado.getString("logincliente"));
			}
			
		} catch (SQLException e) {
			
			System.out.println("Erro ao buscar o Cliente!");
		}
		return cliente;
	}
	
	
	public Cliente autenticarCliente(Cliente cliente) {
		
		String sql = "SELECT * FROM CLIENTE WHERE logincliente=? AND senhacliente=?";
		
		Cliente clienteRetorno = null;
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, cliente.getLoginCliente());
			preparador.setString(2, cliente.getSenhaCliente());
			
			ResultSet resultado = preparador.executeQuery();
			
			if (resultado.next()) {
				clienteRetorno = new Cliente();
				clienteRetorno.setIdCliente(resultado.getInt("idcliente")); 
				clienteRetorno.setNomeCliente(resultado.getString("nomecliente"));
				clienteRetorno.setCpfCliente(resultado.getString("cpfcliente"));
				clienteRetorno.setRgCliente(resultado.getString("rgcliente"));
				clienteRetorno.setDataNascimentoCliente(resultado.getDate("datanascimentocliente"));
				clienteRetorno.setEnderecoCliente(resultado.getString("enderecocliente"));
				clienteRetorno.setCidadeCliente(resultado.getString("cidadecliente"));
				clienteRetorno.setCepCliente(resultado.getString("cepcliente"));
				clienteRetorno.setLoginCliente(resultado.getString("logincliente"));
				clienteRetorno.setLoginCliente(resultado.getString("senhacliente"));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return clienteRetorno;
		
	}

}
