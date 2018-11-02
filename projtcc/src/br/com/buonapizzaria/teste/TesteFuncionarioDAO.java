package br.com.buonapizzaria.teste;

import java.util.List;
import br.com.buonapizzaria.entidades.Funcionario;
import br.com.buonapizzaria.jdbc.FuncionarioDAO;

public class TesteFuncionarioDAO {

	public static void main(String[] args) {

		//TestCadastrar();
		//TestAlterar();
		//TestExcluir();
		TestBuscarTodos();

	}
	
	private static void TestCadastrar() {
		
		FormatarData f = new FormatarData();
		String data = "03/01/1993";
		data = f.formataDataJdbc(data);
		
		java.sql.Date dtConv = java.sql.Date.valueOf(data);
			
		Funcionario func = new Funcionario();
		func.setNomeFuncionario("Mayk Rodrigues");
		func.setCpfFuncionario("09966633391");
		func.setRgFuncionario("01129683");
		func.setDataNascimentoFuncionario(dtConv);
		func.setEnderecoFuncionario("Rua Mae Rosario, 301");
		func.setCidadeFuncionario("Morada");
		func.setCepFuncionario("42960-000");
		func.setCargoFuncionario("Gerente");
		func.setTipoContratacaoFuncionario("CLT");
		func.setEscolaridadeFuncionario("Ensino Médio");
		func.setLoginFuncionario("maykrodigues");
		func.setSenhaFuncionario("mr123456");
					
		FuncionarioDAO funcDAO = new FuncionarioDAO();
		funcDAO.cadastrar(func);
	}
	
	
	private static void TestAlterar() {
		
		FormatarData f = new FormatarData();
		String data = "23/01/1976";
		data = f.formataDataJdbc(data);
	
		java.sql.Date dtConv = java.sql.Date.valueOf(data);
		
		Funcionario func = new Funcionario();
		func.setIdFuncionario(3);
		func.setNomeFuncionario("Mayk Rodrigues Cavalcante");
		func.setCpfFuncionario("09966633392");
		func.setRgFuncionario("0112968345");
		func.setDataNascimentoFuncionario(dtConv);
		func.setEnderecoFuncionario("Rua Mae Rosario, 301");
		func.setCidadeFuncionario("Morada Nova");
		func.setCepFuncionario("62940-000");
		func.setCargoFuncionario("Gerente");
		func.setTipoContratacaoFuncionario("CLT");
		func.setEscolaridadeFuncionario("Ensino Superior Incompleto");
		func.setLoginFuncionario("maykrod");
		func.setSenhaFuncionario("maykrod123");
		
		
		FuncionarioDAO funcDAO = new FuncionarioDAO();
		funcDAO.alterar(func);
	}
	
	private static void TestExcluir() {
		
		Funcionario func = new Funcionario();
		func.setIdFuncionario(2);
		
		FuncionarioDAO funcDAO = new FuncionarioDAO();
		funcDAO.excluir(func);
	}
	
	
	private static void TestBuscarTodos() {
		
		FuncionarioDAO funcDAO = new FuncionarioDAO();
		List<Funcionario> listaResultado = funcDAO.buscarTodos();
		
			for(Funcionario u: listaResultado) {
				System.out.println(u.getIdFuncionario()+ " " + u.getNomeFuncionario()+ " " + u.getCpfFuncionario()+ " " + u.getCargoFuncionario());
			}
	}
	
}
