package model;

public class ItemPedido {
	   private int pedido;
	   private String produto;
	   private int qtde, valor;
	   
	   public ItemPedido(){
		   	 
		      pedido=0;
		      produto="";
		      qtde=0;
		      valor=0;
	   }
	   
	   public void itemPedido(int id,int pedido,String produto,int qtde,int valor){
		      this.pedido=pedido;
		      this.produto=produto;
		      this.qtde=qtde;
		      this.valor=valor;
	   }
	   
	   //GETS
	
	   public int getPedido(){ 
		   return pedido; 
	   }
	   public String getProduto(){ 
		   return produto;
	   }
	   public int getQtde(){ 
		   return qtde;
		}
	   public int getValor(){ 
		   return valor; 
		}
	   
	   
	   //SETS
	 
	   public void setPedido(int pedido){ 
		   this.pedido=pedido; 
		 }
	   public void setProduto(String produto){ 
		   this.produto = produto; 
		 }
	   public void setQtde(int qtde){ 
		   this.qtde = qtde; 
		   }
	   public void setValor(int valor){ 
		   this.valor=valor; 
		   }
	}

