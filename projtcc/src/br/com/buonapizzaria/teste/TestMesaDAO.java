package br.com.buonapizzaria.teste;

import java.util.List;

import br.com.buonapizzaria.entidades.Mesa;
import br.com.buonapizzaria.jdbc.MesaDAO;

public class TestMesaDAO {

	public static void main(String[] args) {
		
		//TestCadastrar();
		//TestAlterar();
		//TestExcluir();
		TestBuscarTodos();
	}
		
private static void TestCadastrar() {
		
		FormatarData f = new FormatarData();
		String data = "22/10/2018";
		data = f.formataDataJdbc(data);
		
		java.sql.Date dtConv = java.sql.Date.valueOf(data);
			
		Mesa mesa = new Mesa();
		mesa.setDescricaoMesa("Mesa 1");
		mesa.setLocalMesa("Interna");
		mesa.setAreaMesa(1);
		mesa.setNumeroPessoasMesa(4);
		mesa.setStatusMesa("Livre");
		mesa.setFomatoMesa("Retangular");
		mesa.setCorMesa("Verde");
		mesa.setDataCompraMesa(dtConv);
		mesa.setCodigoAtendenteFuncionario(1);
				
		MesaDAO mesaDAO = new MesaDAO();
		mesaDAO.cadastrar(mesa);
		
	}
	
	
	private static void TestAlterar() {
		
		FormatarData f = new FormatarData();
		String data = "22/10/2018";
		data = f.formataDataJdbc(data);
	
		java.sql.Date dtConv = java.sql.Date.valueOf(data);
		
		Mesa mesa = new Mesa();
		mesa.setIdMesa(1);
		mesa.setDescricaoMesa("Mesa 1");
		mesa.setLocalMesa("Interna");
		mesa.setAreaMesa(1);
		mesa.setNumeroPessoasMesa(4);
		mesa.setStatusMesa("Livre");
		mesa.setFomatoMesa("Retangular");
		mesa.setCorMesa("Azul");
		mesa.setDataCompraMesa(dtConv);
		mesa.setCodigoAtendenteFuncionario(1);
		
		
		MesaDAO mesaDAO = new MesaDAO();
		mesaDAO.alterar(mesa);
	}
	
	
	private static void TestExcluir() {
		
		Mesa mesa = new Mesa();
		mesa.setIdMesa(3);
		
		MesaDAO mesaDAO = new MesaDAO();
		mesaDAO.excluir(mesa);
		
	}
	
	
	private static void TestBuscarTodos() {
		
		MesaDAO mesaDAO = new MesaDAO();
		List<Mesa> listaResultado = mesaDAO.buscarTodos();
		
			for(Mesa u: listaResultado) {
				System.out.println(u.getIdMesa() + " " + u.getDescricaoMesa()  + " " + u.getStatusMesa() + " " + u.getNumeroPessoasMesa());
			}
	}


}
