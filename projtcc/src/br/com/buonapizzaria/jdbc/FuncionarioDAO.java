package br.com.buonapizzaria.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.buonapizzaria.entidades.Entregador;
import br.com.buonapizzaria.entidades.Funcionario;

public class FuncionarioDAO {
	
	private Connection con = Conexao.getConnection();
	
	public void cadastrar(Funcionario funcionario) {
		
		String sql = "INSERT INTO FUNCIONARIO (nomefuncionario, cpffuncionario, rgfuncionario, datanascimentofuncionario, enderecofuncionario, cidadefuncionario, cepfuncionario, cargofuncionario, tipocontratacaofuncionario, escolaridadefuncionario, loginfuncionario, senhafuncionario) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		//Constroe o PreparedStatement com o SQL
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, funcionario.getNomeFuncionario());
			preparador.setString(2, funcionario.getCpfFuncionario());
			preparador.setString(3, funcionario.getRgFuncionario());
			preparador.setDate(4, funcionario.getDataNascimentoFuncionario());
			preparador.setString(5,  funcionario.getEnderecoFuncionario());
			preparador.setString(6, funcionario.getCidadeFuncionario());
			preparador.setString(7, funcionario.getCepFuncionario());
			preparador.setString(8, funcionario.getCargoFuncionario());
			preparador.setString(9, funcionario.getTipoContratacaoFuncionario());
			preparador.setString(10, funcionario.getEscolaridadeFuncionario());
			preparador.setString(11, funcionario.getLoginFuncionario());
			preparador.setString(12, funcionario.getSenhaFuncionario());
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Funcionário cadastrado com sucesso!");
			
		} catch (SQLException e) {
			System.out.println("Erro ao cadastrar um novo Funcionário");
		}
	}
		
	public void alterar(Funcionario funcionario) {
			
		String sql = "UPDATE FUNCIONARIO SET nomefuncionario=?, cpffuncionario=?, rgfuncionario=?, datanascimentofuncionario=?, enderecofuncionario=?, cidadefuncionario=?, cepfuncionario=?, cargofuncionario=?, tipocontratacaofuncionario=?, escolaridadefuncionario=?, loginfuncionario=?, senhafuncionario=? WHERE idfuncionario=?";
			
		//Constroe o PreparedStatement com o SQL
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, funcionario.getNomeFuncionario());
			preparador.setString(2, funcionario.getCpfFuncionario());
			preparador.setString(3, funcionario.getRgFuncionario());
			preparador.setDate(4, funcionario.getDataNascimentoFuncionario());
			preparador.setString(5,  funcionario.getEnderecoFuncionario());
			preparador.setString(6, funcionario.getCidadeFuncionario());
			preparador.setString(7, funcionario.getCepFuncionario());
			preparador.setString(8, funcionario.getCargoFuncionario());
			preparador.setString(9, funcionario.getTipoContratacaoFuncionario());
			preparador.setString(10, funcionario.getEscolaridadeFuncionario());
			preparador.setString(11, funcionario.getLoginFuncionario());
			preparador.setString(12, funcionario.getSenhaFuncionario());
			preparador.setInt(13, funcionario.getIdFuncionario());
				
			preparador.execute();
			preparador.close();
				
			System.out.println("Funcionário Nº "+ funcionario.getIdFuncionario() + " alterado com sucesso!");
				
			} catch (SQLException e) {
				System.out.println("Não foi possível alterar o Funcionário");
			}	
	}
	
	
	public void salvar(Funcionario funcionario) {
		if(funcionario.getIdFuncionario()!=null && funcionario.getIdFuncionario()!=0) {
			alterar(funcionario);
		}
		else {
			cadastrar(funcionario);
		}
	}
	
	
	public void excluir(Funcionario funcionario) {
		
		String sql = "DELETE FROM FUNCIONARIO WHERE idfuncionario=?";
	
		//Constroe o PreparedStatement com o SQL
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, funcionario.getIdFuncionario());
			
			preparador.execute();
			preparador.close();
			
			System.out.println("O Funcionario Nº " + funcionario.getIdFuncionario() + " excluido com sucesso!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	
	public List<Funcionario> buscarTodos() {
		
		String sql = "SELECT * FROM  FUNCIONARIO";
		
		List<Funcionario> lista = new ArrayList<Funcionario>();
	
		//Constroe o PreparedStatement com o SQL
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			
			ResultSet resultado = preparador.executeQuery();
			
			while(resultado.next()) {
				
				Funcionario func = new Funcionario();
				
				//o resultado armazena todo o valor das colunas
				func.setIdFuncionario(resultado.getInt("idfuncionario"));
				func.setNomeFuncionario(resultado.getString("nomefuncionario"));
				func.setCpfFuncionario(resultado.getString("cpffuncionario"));
				func.setRgFuncionario(resultado.getString("rgfuncionario"));
				func.setDataNascimentoFuncionario(resultado.getDate("datanascimentofuncionario"));
				func.setEnderecoFuncionario(resultado.getString("enderecofuncionario"));
				func.setCidadeFuncionario(resultado.getString("cidadefuncionario"));
				func.setCepFuncionario(resultado.getString("cepfuncionario"));
				func.setCargoFuncionario(resultado.getString("cargofuncionario"));
				func.setTipoContratacaoFuncionario(resultado.getString("tipocontratacaofuncionario"));
				func.setEscolaridadeFuncionario(resultado.getString("escolaridadefuncionario"));
				func.setLoginFuncionario(resultado.getString("loginfuncionario"));
				func.setSenhaFuncionario(resultado.getString("senhafuncionario"));
				
				
				lista.add(func);
				
			}
			
			preparador.close();	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		return lista;
	}
}
		
		
		

