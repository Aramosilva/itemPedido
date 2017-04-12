package servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.PedidoService;
import model.ItemPedido;

/**
 * Servlet implementation class pedidoServelet
 */
@WebServlet("/CrudPedido")
public class pedidoServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
 	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pProduto = request.getParameter("produto");
        int pQtde = Integer.parseInt(request.getParameter("qtde"));
        int pValor = Integer.parseInt(request.getParameter("valor"));
        
        //instanciar o javabean
        ItemPedido item = new ItemPedido();
        item.setProduto(pProduto);
        item.setQtde(pQtde);
        item.setValor(pValor);
        
        //instanciar o service
        PedidoService ps = new PedidoService();
        ps.criar(item);
        item = ps.carregar(item.getPedido());
        
        //enviar para o jsp
        request.setAttribute("cliente", item);
        
        javax.servlet.RequestDispatcher view = 
        request.getRequestDispatcher("Cliente.jsp");
        view.forward(request, response);
        
	}

}
