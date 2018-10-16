package br.com.buonapizzaria.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.buonapizzaria.entidades.Entregador;

public class EntregadorDAO {

private Connection con = Conexao.getConnection();
	
	public void cadastrar(Entregador entregador) {
		
		String sql = "INSERT INTO CLIENTE (nomeEntregador, cpfEntregador, "
				+ "dataNascimentoEntregador, enderecoEntregador, cidadeEntregador, cepEntregador,"
				+ "foneContato, categoriaHabilitacaoEntregador, numeroHabilitacaoEntregador ) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
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

}
