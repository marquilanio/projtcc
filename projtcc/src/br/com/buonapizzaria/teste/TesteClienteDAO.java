package br.com.buonapizzaria.teste;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import br.com.buonapizzaria.entidades.Cliente;
import br.com.buonapizzaria.jdbc.ClienteDAO;

public class TesteClienteDAO {

	public static void main(String[] args) {
	
		cadastrar();

	}

	private static void cadastrar() {
		
		FormatarData f = new FormatarData();
		String data = "20/01/1980";
		data = f.formataDataJdbc(data);
		
		
		Cliente cli = new Cliente();
		cli.setNomeCliente("Gaga Drigues");
		cli.setCpfCliente("10008555-12");
		cli.setRgCliente("111114444");
		cli.setDataNascimentoCliente(data);
		cli.setEnderecoCliente("Rua do Ze, 10 - BV");
		cli.setCidadeCliente("Recife");
		cli.setCepCliente("76111-000");
		cli.setLoginCliente("gagadri");
		cli.setSenhaCliente("gaga123");
		
		ClienteDAO usuDAO = new ClienteDAO();
		usuDAO.cadastrar(cli);
		System.out.println("Data formatada: " + data );
	}

}
