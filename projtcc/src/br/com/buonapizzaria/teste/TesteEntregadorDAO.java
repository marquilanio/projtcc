package br.com.buonapizzaria.teste;


import java.util.List;
import br.com.buonapizzaria.entidades.Entregador;
import br.com.buonapizzaria.jdbc.EntregadorDAO;

public class TesteEntregadorDAO {

	public static void main(String[] args) {
		
		//TestCadastrar();
		//TestAlterar();
		//TestExcluir();
		TestBuscarTodos();
		
	}
	
	
	private static void TestCadastrar() {
		
		FormatarData f = new FormatarData();
		String data = "01/06/1983";
		data = f.formataDataJdbc(data);
		
		java.sql.Date dtConv = java.sql.Date.valueOf(data);
			
		Entregador entr = new Entregador();
		entr.setNomeEntregador("Pedro Mariano");
		entr.setCpfEntregador("95767523491");
		entr.setDataNascimentoEntregador(dtConv);
		entr.setEnderecoEntregador("Rua das Formigas, 43");
		entr.setCidadeEntregador("Camaragibe");
		entr.setCepEntregador("54000-123");
		entr.setFoneContatoEntregador("81 99991-1212");
		entr.setCategoriaHabilitacaoEntregador("A");
		entr.setNumeroHabilitacaoEntregador("12390087521");
		
					
		EntregadorDAO entrDAO = new EntregadorDAO();
		entrDAO.cadastrar(entr);
	}
	
	
	private static void TestAlterar() {
		
		FormatarData f = new FormatarData();
		String data = "10/05/1985";
		data = f.formataDataJdbc(data);
	
		java.sql.Date dtConv = java.sql.Date.valueOf(data);
		
		Entregador entr = new Entregador();
		entr.setIdEntregador(2);
		entr.setNomeEntregador("Marcos Vinicius");
		entr.setCpfEntregador("09987644421");
		entr.setDataNascimentoEntregador(dtConv);
		entr.setEnderecoEntregador("Rua Mano de Boa,  33");
		entr.setCidadeEntregador("Recife");
		entr.setCepEntregador("50910-999");
		entr.setFoneContatoEntregador("(81)99961-0010");
		entr.setCategoriaHabilitacaoEntregador("B");
		entr.setNumeroHabilitacaoEntregador("31029978910");
		
		EntregadorDAO entrDAO = new EntregadorDAO();
		entrDAO.alterar(entr);
	}
	
	
	private static void TestExcluir() {
		
		Entregador entr = new Entregador();
		entr.setIdEntregador(3);
		
		EntregadorDAO entrDAO = new EntregadorDAO();
		entrDAO.excluir(entr);
	}
	
	
	private static void TestBuscarTodos() {
		
		EntregadorDAO entrDAO = new EntregadorDAO();
		List<Entregador> listaResultado = entrDAO.buscarTodos();
		
			for(Entregador u: listaResultado) {
				System.out.println(u.getIdEntregador()+ " " + u.getNomeEntregador()+ " " + u.getCpfEntregador());
			}
	}


}
