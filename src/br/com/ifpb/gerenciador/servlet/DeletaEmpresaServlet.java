package br.com.ifpb.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeletaEmpresaServlet
 */
@WebServlet("/deletaEmpresa")
public class DeletaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletaEmpresaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		request.setAttribute("lista", lista);
		String nomeEmpresa = request.getParameter("nome");
		if(nomeEmpresa!=null) {
			banco.remove(nomeEmpresa);
		}else {
			System.out.println("Nome Vazio !");
		}
		
		RequestDispatcher rd =request.getRequestDispatcher("/formDeletaEmpresa.jsp");
		request.setAttribute("lista", lista);
		rd.forward(request, response);
		
	}

}
