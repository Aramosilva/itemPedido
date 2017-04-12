package Service;

import DAO.PedidoDAO;
import model.ItemPedido;

public class PedidoService {
		PedidoDAO dao;
		
		//------------------------------
		public PedidoService(){
			dao = new PedidoDAO();
		}
		//---------------------------
		public void ItemPedido(){
			dao = new PedidoDAO();
		}
		
		public void criar(model.ItemPedido p) {   
			dao.incluir(p);  
		} 
		
		public void atualizar(model.ItemPedido p) {   
			  dao.atualizar(p);  
		} 
		
		public void excluir(model.ItemPedido p) {   
			  dao.excluir(p);  
		 } 
		  
		public ItemPedido carregar(int iPedido) {   
			return  dao.carregar(iPedido);  
		 } 

		@Override
		public String toString() {
			return "PedidoService [dao=" + dao + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ ", toString()=" + super.toString() + "]";
		} 
}
