package application;

import java.util.Date;

import entities.ItemPedido;
import entities.Pedido;
import entities.Product;
import entities.enums.StatusPedido;

public class GerenciamentoDePedidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Criacao de Produtos
		Product p1 = new Product("Laptop Gamer X500", 400000.00);
		Product p2 = new Product("Teclado Gamer", 10000.00);
		Product p3 = new Product("Monitor Ultra", 20000.00);
		
		//	Criacao de itens de pedido
		ItemPedido ip1 = new ItemPedido(1, p1);
		ItemPedido ip2 = new ItemPedido(2, p2);
		ItemPedido ip3 = new ItemPedido(4, p3);
		
		//	Criacao do pedido inicial
		Date momentoInicial = new Date();
		Pedido meuPedido = new Pedido(momentoInicial, StatusPedido.PROCESSANDO);
		
		//	Adicao de itens e calculo inicial
		meuPedido.addItem(ip1);
		meuPedido.addItem(ip2);
		meuPedido.addItem(ip3);
		
		System.out.println("--Pedido criado e um Processamento--");
		System.out.println(meuPedido.resumoPedido());
		
// --- E. SIMULAÇÃO DE MUDANÇA DE STATUS E REMOÇÃO ---
        
        // 1. Simular remoção de um item
        System.out.println("\n-------------------------------------------");
        System.out.println("⛔ Removendo 2x Teclado Mecânico...");
        meuPedido.removeItem(ip2);
        
        // 2. Simular mudança de status
        meuPedido.setStatus(StatusPedido.ENVIADO);
        
        // 3. Imprimir o status e o valor total atualizado
        System.out.println("\n--- ✅ Pedido Atualizado e Enviado ---\n");
        System.out.println(meuPedido.resumoPedido());
        
        System.out.println("\n-------------------------------------------");
        System.out.println("Status Final: **" + meuPedido.getStatus() + "**");
        System.out.println("Valor Total Recalculado: R$ **" + String.format("%.2f", meuPedido.total()) + "**");
		
		//	
	}

}
