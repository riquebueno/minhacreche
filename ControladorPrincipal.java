package controle;

import javax.servlet.*;
import javax.servlet.http.*;

import modelo.ModeloPrincipal;

import java.io.*;
import java.util.ArrayList;

public class ControladorPrincipal extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		//res.setContentType("text/html");
		//PrintWriter out = res.getWriter();
		//out.println("<html><head><title>Hello World!</title></head>");
		//out.println("<body><h1>Hello World!</h1></body></html>");
	
		ModeloPrincipal modeloPrincipal = new ModeloPrincipal();
		
		String proxima = null;
		String acao=null;
		String cidade = null;
		String bairro = null;
		
		acao=req.getParameter("acao");
		//System.out.println(acao);
		
		cidade=req.getParameter("cidade");
		System.out.println(cidade);
		
		bairro=req.getParameter("bairro");
		System.out.println(bairro);	
		
		
		if(acao==null){
			proxima="erro.jsp";
		}
		else if(acao.equals("todos")){
			ArrayList listaDeCreches=modeloPrincipal.listarTodos();
			req.setAttribute("listaDeCreches", listaDeCreches);
			proxima="listarTodos.jsp";
		}
		else if(acao.equals("refinar")){
			//ArrayList listaDeCreches=modeloPrincipal.listarTodos();
			//req.setAttribute("listaDeCreches", listaDeCreches);
			proxima="busca.jsp";
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(proxima);
	    dispatcher.forward(req, res);
		
	    
	    
	    
		/*
		switch(acao){
			//case "refinar":
				//
				//break;
			case "todos":
				proxima="listarTodos.jsp";
				ArrayList listaDeCreches=modeloPrincipal.listarTodos();
				//req.setAttribute("listaDeCreches", listaDeCreches);
				//RequestDispatcher dispatcher = req.getRequestDispatcher(proxima);
			    //dispatcher.forward(req, res);
				break;
			default:
				System.out.println("Nenhuma das opções");
				throw new IOException("Nenhuma das opções");//terrivel, vamos corrigir depois ...
		}
		*/	
		
		
		
		
		
		
		
		
	}
	
}
