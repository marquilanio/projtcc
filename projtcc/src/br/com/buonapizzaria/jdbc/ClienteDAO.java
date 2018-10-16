package br.com.buonapizzaria.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
			preparador.setDate(4, cliente.getDataNascimentoPessoa());
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
}
