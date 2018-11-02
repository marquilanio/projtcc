package br.com.buonapizzaria.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.buonapizzaria.entidades.Mesa;

public class MesaDAO {
	
private Connection con = Conexao.getConnection();
	
	public void cadastrar(Mesa mesa) {
		
		String sql = "INSERT INTO MESA (descricaoMesa, localMesa, areaMesa, numeroPessoasMesa, statusMesa, fomatoMesa, corMesa, dataCompraMesa, codigoAtendenteFuncionario) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		//Constroe o PreparedStatement com o SQL
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, mesa.getDescricaoMesa());
			preparador.setString(2, mesa.getLocalMesa());
			preparador.setInt(3, mesa.getAreaMesa());
			preparador.setInt(4, mesa.getNumeroPessoasMesa());
			preparador.setString(5, mesa.getStatusMesa());
			preparador.setString(6, mesa.getFomatoMesa());
			preparador.setString(7, mesa.getCorMesa());
			preparador.setDate(8, mesa.getDataCompraMesa());
			preparador.setInt(9, mesa.getCodigoAtendenteFuncionario());
						
			preparador.execute();
			preparador.close();
			
			System.out.println("Mesa cadastrado com sucesso!");
			
		} catch (SQLException e) {
			System.out.println("Erro ao cadastrar uma nova Mesa");
		}
	}
	
	
	public void alterar(Mesa mesa) {
		
		String sql = "UPDATE MESA SET descricaoMesa=?, localMesa=?, areaMesa=?, numeroPessoasMesa=?, statusMesa=?, fomatoMesa=?, corMesa=?, dataCompraMesa=?, codigoAtendenteFuncionario=? WHERE idmesa=?";
	
		//Constroe o PreparedStatement com o SQL
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, mesa.getDescricaoMesa());
			preparador.setString(2, mesa.getLocalMesa());
			preparador.setInt(3, mesa.getAreaMesa());
			preparador.setInt(4, mesa.getNumeroPessoasMesa());
			preparador.setString(5, mesa.getStatusMesa());
			preparador.setString(6, mesa.getFomatoMesa());
			preparador.setString(7, mesa.getCorMesa());
			preparador.setDate(8, mesa.getDataCompraMesa());
			preparador.setInt(9, mesa.getCodigoAtendenteFuncionario());
			preparador.setInt(10, mesa.getIdMesa());
		
			preparador.execute();
			preparador.close();
			
			System.out.println("Mesa alterada com sucesso!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	
	public void excluir(Mesa mesa) {
		
		String sql = "DELETE FROM MESA WHERE idmesa=?";
	
		//Constroe o PreparedStatement com o SQL
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, mesa.getIdMesa());
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Mesa Nº " + mesa.getIdMesa() + " excluido com sucesso!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	
	public List<Mesa> buscarTodos() {
		
		String sql = "SELECT * FROM  MESA";
		
		List<Mesa> lista = new ArrayList<Mesa>();
	
		//Constroe o PreparedStatement com o SQL
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			
			ResultSet resultado = preparador.executeQuery();
			
			while(resultado.next()) {
				
				Mesa mesa = new Mesa();
				
				//o resultado armazena todo o valor das colunas
				mesa.setIdMesa(resultado.getInt("idMesa"));
				mesa.setDescricaoMesa(resultado.getString("descricaoMesa"));
				mesa.setLocalMesa(resultado.getString("localMesa"));
				mesa.setAreaMesa(resultado.getInt("areaMesa"));
				mesa.setNumeroPessoasMesa(resultado.getInt("numeroPessoasMesa"));
				mesa.setStatusMesa(resultado.getString("statusMesa"));
				mesa.setFomatoMesa(resultado.getString("fomatoMesa"));
				mesa.setCorMesa(resultado.getString("corMesa"));
				mesa.setDataCompraMesa(resultado.getDate("dataCompraMesa"));
				mesa.setCodigoAtendenteFuncionario(resultado.getInt("codigoAtendenteFuncionario"));	
						
				lista.add(mesa);			
			}
			
			preparador.close();	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		return lista;
	}


}
