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
	
		TestCadastrar();
		//TestAlterar();
		//TestExcluir();
		//TestBuscarTodos();
	}

	private static void TestCadastrar() {
		
		FormatarData f = new FormatarData();
		String data = "01/06/1985";
		data = f.formataDataJdbc(data);
		
		java.sql.Date dtConv = java.sql.Date.valueOf(data);
			
		Cliente cli = new Cliente();
		cli.setNomeCliente("Jao Torto");
		cli.setCpfCliente("12463945691");
		cli.setRgCliente("2003345008769");
		cli.setDataNascimentoCliente(dtConv);
		cli.setEnderecoCliente("Rua das Pitomba, 11 - Genipapo");
		cli.setCidadeCliente("Vasco");
		cli.setCepCliente("43556-000");
		cli.setLoginCliente("jaotorto");
		cli.setSenhaCliente("jao123");
		
		ClienteDAO usuDAO = new ClienteDAO();
		usuDAO.cadastrar(cli);
	}
	
	
	private static void TestAlterar() {
	
		FormatarData f = new FormatarData();
		String data = "01/06/1980";
		data = f.formataDataJdbc(data);
	
		java.sql.Date dtConv = java.sql.Date.valueOf(data);
		
		Cliente cli = new Cliente();
		cli.setIdCliente(12);
		cli.setNomeCliente("Bobo Corvo");
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
