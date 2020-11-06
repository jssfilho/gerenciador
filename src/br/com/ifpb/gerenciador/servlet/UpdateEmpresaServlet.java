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
 * Servlet implementation class UpdateEmpresaServlet
 */
@WebServlet("/editaEmpresa")
public class UpdateEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEmpresaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		request.setAttribute("lista", lista);
		String novoNome = request.getParameter("novoNome");
		String nomeEmpresa = request.getParameter("nome");
		if(novoNome!=null && !banco.existeEmpresa(novoNome)) {
				banco.editaNome(nomeEmpresa,novoNome);
		}else {
			System.out.println("Um dos valores esta vazio!");
		}
		RequestDispatcher rd =request.getRequestDispatcher("/formEditaEmpresa.jsp");
		request.setAttribute("lista", lista);
		rd.forward(request, response);
		
	}

}
