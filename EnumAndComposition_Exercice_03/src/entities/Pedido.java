package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date moment;
	private StatusPedido status;
	
	private List<ItemPedido> itens = new  ArrayList<>();
	
	public Pedido(Date moment, StatusPedido status) {
		this.moment = moment;
		this.status = status;
	}
	//	Método: Adiciona um ItemPedido à lista
	public void addItem(ItemPedido item){
		itens.add(item);
	}
	// Método: Remove um ItemPedido da lista
	public void removeItem(ItemPedido item) {
		itens.remove(item);
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	
	public Double total() {
		double soma = 0.0;
		for(ItemPedido item : itens) {
			soma += item.subTotal();
		}
		return soma;
	}
	// Método para imprimir o resumo completo
	public String resumoPedido() {
		StringBuilder sb = new StringBuilder();
		sb.append("----Resumo do Pedido-----\n");
		sb.append("Momento do Pedido: ").append(sdf.format(moment)).append("\n");
		sb.append("Status: ").append(status).append("\n");
		sb.append("Itens:\n");
		for(ItemPedido item : itens) {
			sb.append(" > ").append(item).append("\n");
		}
		sb.append("Valor Total: R$ ").append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
	
	
	
	
}