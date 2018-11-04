package br.com.buonapizzaria.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.buonapizzaria.entidades.Entregador;
import br.com.buonapizzaria.entidades.Funcionario;
import br.com.buonapizzaria.jdbc.FuncionarioDAO;

@WebServlet("/funccontroller.do")
public class FuncionarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FuncionarioController() {
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
		String rg = request.getParameter("txtrg");
		String dtNasc = request.getParameter("dataNasc");
		String endereco = request.getParameter("txtendereco");
		String cidade = request.getParameter("txtcidade");
		String cep = request.getParameter("txtcep");
		String cargo = request.getParameter("txtcargo");
		String tpContr = request.getParameter("txttipocontratacao");
		String escolarid = request.getParameter("txtescolaridade");
		String login = request.getParameter("txtlogin");
		String senha = request.getParameter("txtsenha");
		String codCliente = request.getParameter("txtcodcliente");
		
		
		java.sql.Date dtConv = java.sql.Date.valueOf(dtNasc);
		
		Funcionario funcionario = new Funcionario();
		
		Boolean UPDT = false;
		
		if(id!=null && id!="" && id!="0") {	
			funcionario.setIdFuncionario(Integer.parseInt(id));
			UPDT = true;
		}
		funcionario.setNomeFuncionario(nome);
		funcionario.setCpfFuncionario(cpf);
		funcionario.setRgFuncionario(rg);
		funcionario.setDataNascimentoFuncionario(dtConv);
		funcionario.setEnderecoFuncionario(endereco);
		funcionario.setCidadeFuncionario(cidade);
		funcionario.setCepFuncionario(cep);
		funcionario.setCargoFuncionario(cargo);
		funcionario.setTipoContratacaoFuncionario(tpContr);
		funcionario.setEscolaridadeFuncionario(escolarid);
		funcionario.setLoginFuncionario(login);
		funcionario.setSenhaFuncionario(senha);
		funcionario.setCodigoClienteFuncionario(codCliente);
		
		FuncionarioDAO funcDAO = new FuncionarioDAO();
		funcDAO.salvar(funcionario);
		
		PrintWriter saida1 = response.getWriter();
		
		if(UPDT) {
			saida1.println("Produto atualizado com sucesso!");
		}
		else {
			saida1.println("Produto cadastrado com sucesso!");
		}	
	
	}

}
