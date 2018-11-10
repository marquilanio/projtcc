package br.com.buonapizzaria.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.buonapizzaria.entidades.Cliente;
import br.com.buonapizzaria.jdbc.ClienteDAO;

@WebServlet("/clicontroller.do")
public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ClienteController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Chamando método Get");
		
		ClienteDAO clieDAO = new ClienteDAO();
		String acao = request.getParameter("acao");
		
		if (acao!=null && acao.equals("exc")) {
			
			String id = request.getParameter("id");
			
			Cliente cli = new Cliente();
			cli.setIdCliente(Integer.parseInt(id));
			
			clieDAO.excluir(cli);
			
		}
		
		List<Cliente> lista = clieDAO.buscarTodos();
		
		request.setAttribute("ListaCliente", lista);
		
		RequestDispatcher saida = request.getRequestDispatcher("listaclientes.jsp");
		saida.forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Chamando método Post");
		
		String id = request.getParameter("txtid");
		String nome = request.getParameter("txtnome");
		String cpf = request.getParameter("txtcpf");
		String rg = request.getParameter("txtcpf");
		String dtNasc = request.getParameter("dataNasc");
		String endereco = request.getParameter("txtendereco");
		String cidade = request.getParameter("txtcidade");
		String cep = request.getParameter("txtcep");
		String login = request.getParameter("txtlogin");
		String senha = request.getParameter("txtsenha");
				
		java.sql.Date dtConv = java.sql.Date.valueOf(dtNasc);
		
		Cliente cliente = new Cliente();
		
		Boolean UPDT = false;
		
		if(id!=null && id!="" && id!="0") {	
			cliente.setIdCliente(Integer.parseInt(id));
			UPDT = true;
		}
		cliente.setNomeCliente(nome);
		cliente.setCpfCliente(cpf);
		cliente.setRgCliente(rg);
		cliente.setDataNascimentoCliente(dtConv);
		cliente.setEnderecoCliente(endereco);
		cliente.setCidadeCliente(cidade);
		cliente.setCepCliente(cep);
		cliente.setLoginCliente(login);
		cliente.setSenhaCliente(senha);
		
				
		ClienteDAO clieDAO = new ClienteDAO();
		clieDAO.salvar(cliente);
		
		PrintWriter saida1 = response.getWriter();
		
		if(UPDT) {
			saida1.println("Cliente atualizado com sucesso!");
		}
		else {
			saida1.println("Cliente cadastrado com sucesso!");
		}	
	}

}
