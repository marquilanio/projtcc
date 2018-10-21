package br.com.buonapizzaria.teste;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import br.com.buonapizzaria.entidades.Cliente;
import br.com.buonapizzaria.jdbc.ClienteDAO;

public class TesteClienteDAO {

	public static void main(String[] args) {
	
		//TestCadastrar();
		TestAlterar();
		//TestExcluir();
		//TestBuscarTodos();
	}

	private static void TestCadastrar() {
		
		FormatarData f = new FormatarData();
		String data = "01/06/1985";
		data = f.formataDataJdbc(data);
		
		java.sql.Date dtConv = java.sql.Date.valueOf(data);
			
		Cliente cli = new Cliente();
		cli.setNomeCliente("Wagner Silva");
		cli.setCpfCliente("12463977777");
		cli.setRgCliente("2003345004848");
		cli.setDataNascimentoCliente(dtConv);
		cli.setEnderecoCliente("Rua das Acce, 10 - Genipapo");
		cli.setCidadeCliente("Recife");
		cli.setCepCliente("5100-000");
		cli.setLoginCliente("bolsonaro");
		cli.setSenhaCliente("bolso123");
		
		ClienteDAO usuDAO = new ClienteDAO();
		usuDAO.cadastrar(cli);
	}
	
	
	private static void TestAlterar() {
	
		FormatarData f = new FormatarData();
		String data = "01/06/1980";
		data = f.formataDataJdbc(data);
	
		java.sql.Date dtConv = java.sql.Date.valueOf(data);
		
		Cliente cli = new Cliente();
		cli.setIdCliente(18);
		cli.setNomeCliente("Wagner Bolsonaro");
		cli.setCpfCliente("854630873");
		cli.setRgCliente("");
		cli.setDataNascimentoCliente(dtConv);
		cli.setEnderecoCliente("Rua das Ata, 14 - Genipapo");
		cli.setCidadeCliente("Vasco");
		cli.setCepCliente("43556-000");
		cli.setLoginCliente("jaotutu");
		cli.setSenhaCliente("jao123");
		
		ClienteDAO usuDAO = new ClienteDAO();
		usuDAO.alterar(cli);
	}
	
	private static void TestExcluir() {
		
		Cliente cli = new Cliente();
		cli.setIdCliente(12);
		
		ClienteDAO usuDAO = new ClienteDAO();
		usuDAO.excluir(cli);
	}
	
	private static void TestBuscarTodos() {
		
		ClienteDAO usuDAO = new ClienteDAO();
		List<Cliente> listaResultado = usuDAO.buscarTodos();
		
			for(Cliente u: listaResultado) {
				System.out.println(u.getIdCliente()+ " " + u.getNomeCliente()+ " " + u.getCpfCliente());
			}
	}
	


}
