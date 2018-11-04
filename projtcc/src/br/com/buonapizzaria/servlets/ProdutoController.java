package br.com.buonapizzaria.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.buonapizzaria.entidades.Produto;
import br.com.buonapizzaria.jdbc.ProdutoDAO;

@WebServlet("/prodcontroller.do")
public class ProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProdutoController() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Chamando método Get");

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Chamando método Post");
		
		String id = request.getParameter("txtid");
		String desc = request.getParameter("txtdesc");
		String numFatias = request.getParameter("txtnfatias");
		String unidMedida = request.getParameter("txtunidmedida");
		String prUnit = request.getParameter("txtprecounit");
		String tpFabric = request.getParameter("txttipofabric");
		String dtFabric  = request.getParameter("dtFabricacao");
		String valid  = request.getParameter("txtvalidade");
		String fornec = request.getParameter("textfornec");
		String infoGerais = request.getParameter("txtinfogerais");
		
		java.sql.Date dtConv = java.sql.Date.valueOf(dtFabric);
		
		Produto prod = new Produto();
		
		Boolean UPDT = false;
		
		if(id!=null && id!="" && id!="0") {	
			prod.setIdProduto(Integer.parseInt(id));
			UPDT = true;
		}
		prod.setDescricaoProduto(desc);
		prod.setNumeroFatiasProduto(Integer.parseInt(numFatias));
		prod.setUnidadeMedidaProduto(unidMedida);
		prod.setPrecoUnitarioProduto(Double.valueOf(prUnit));
		prod.setTipoFabricacaoProduto(tpFabric);
		prod.setDataFabricacaoProduto(dtConv);
		prod.setValidadeProdutoEmDias(Integer.parseInt(valid));
		prod.setFornecedorProduto(fornec);
		prod.setInformacoesGeraisProduto(infoGerais);
		
		ProdutoDAO prodDAO = new ProdutoDAO();
		prodDAO.salvar(prod);
		
		PrintWriter saida1 = response.getWriter();
		
		if(UPDT) {
			saida1.println("Produto atualizado com sucesso!");
		}
		else {
			saida1.println("Produto cadastrado com sucesso!");
		}	
		
	}

}
