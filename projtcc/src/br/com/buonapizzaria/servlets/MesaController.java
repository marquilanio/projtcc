package br.com.buonapizzaria.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.buonapizzaria.entidades.Mesa;
import br.com.buonapizzaria.jdbc.MesaDAO;

@WebServlet("/mesacontroller.do")
public class MesaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MesaController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Chamando método Get");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Chamando método Post");
		
		String id = request.getParameter("txtid");
		String desc = request.getParameter("txtdesc");
		String local = request.getParameter("txtlocal");
		String area = request.getParameter("txtarea");
		String numPess = request.getParameter("numPessoas");
		String status = request.getParameter("txtstatus");
		String formato  = request.getParameter("txtformato");
		String cor  = request.getParameter("txtcor");
		String dtCompra = request.getParameter("dtCompra");
		String codAtend = request.getParameter("txtcodAtendente");
		
		java.sql.Date dtConv = java.sql.Date.valueOf(dtCompra);
		
		Mesa  mesa = new Mesa();
		
		Boolean UPDT = false;
		
		if(id!=null && id!="" && id!="0") {	
			mesa.setIdMesa(Integer.parseInt(id));
			UPDT = true;
		}
		mesa.setDescricaoMesa(desc);
		mesa.setLocalMesa(local);
		mesa.setAreaMesa(Integer.parseInt(area));
		mesa.setNumeroPessoasMesa(Integer.parseInt(numPess));
		mesa.setStatusMesa(status);
		mesa.setFomatoMesa(formato);
		mesa.setCorMesa(cor);
		mesa.setDataCompraMesa(dtConv);
		mesa.setCodigoAtendenteFuncionario(Integer.parseInt(codAtend));
		
		MesaDAO mesDAO = new MesaDAO();
		mesDAO.salvar(mesa);
		
		PrintWriter saida1 = response.getWriter();
		
		if(UPDT) {
			saida1.println("Mesa atualizada com sucesso!");
		}
		else {
			saida1.println("Mesa cadastrada com sucesso!");
		}
		
	}

}
