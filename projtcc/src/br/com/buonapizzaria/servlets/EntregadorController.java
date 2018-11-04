package br.com.buonapizzaria.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.buonapizzaria.entidades.Entregador;
import br.com.buonapizzaria.jdbc.EntregadorDAO;

@WebServlet("/entrcontroller.do")
public class EntregadorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	public EntregadorController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Chamando método Get");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Chamando método Post");
		
		String id = request.getParameter("txtid");
		String nome = request.getParameter("txtnome");
		String cpf = request.getParameter("txtcpf");
		String dtNasc = request.getParameter("dataNasc");
		String endereco = request.getParameter("txtendereco");
		String cidade = request.getParameter("txtcidade");
		String cep = request.getParameter("txtcep");
		String fone = request.getParameter("txtfone");
		String categ = request.getParameter("txtcategoria");
		String numCnh = request.getParameter("txtnumcnh");
		
				
		java.sql.Date dtConv = java.sql.Date.valueOf(dtNasc);
		
		Entregador entregador = new Entregador();
		
		Boolean UPDT = false;
		
		if(id!=null && id!="" && id!="0") {	
			entregador.setIdEntregador(Integer.parseInt(id));
			UPDT = true;
		}
		entregador.setNomeEntregador(nome);
		entregador.setCpfEntregador(cpf);
		entregador.setDataNascimentoEntregador(dtConv);
		entregador.setEnderecoEntregador(endereco);
		entregador.setCidadeEntregador(cidade);
		entregador.setCepEntregador(cep);
		entregador.setFoneContatoEntregador(fone);
		entregador.setCategoriaHabilitacaoEntregador(categ);
		entregador.setNumeroHabilitacaoEntregador(numCnh);
		
				
		EntregadorDAO entreDAO = new EntregadorDAO();
		entreDAO.salvar(entregador);
		
		PrintWriter saida1 = response.getWriter();
		
		if(UPDT) {
			saida1.println("Entregador atualizado com sucesso!");
		}
		else {
			saida1.println("Entregador cadastrado com sucesso!");
		}	
	
	}

}
