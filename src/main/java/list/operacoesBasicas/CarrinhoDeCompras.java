package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List <Item> carrinhoList;

	public CarrinhoDeCompras() {
		this.carrinhoList = new ArrayList<>();
	}
	
	public void adicionarItem (String nome, double preco, int quantidade){
		carrinhoList.add(new Item(nome, preco, quantidade));
	
	}
	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		for(Item t : carrinhoList) {
			if(t.getNome().equalsIgnoreCase(nome)) {
				itensParaRemover.add(t);
			}
		}
		carrinhoList.removeAll(itensParaRemover);
	}
	public double calcularValorTotal() {
		Double PrecoTotal = 0.0;
		for(Item t : carrinhoList) {
			PrecoTotal = PrecoTotal + (t.getPreco());
		}
		return PrecoTotal;
	}
	public void exibirItens() {
		for(Item t : carrinhoList) {
			System.out.println((t.getNome()));
		}
	}
	 @Override
	  public String toString() {
	    return "CarrinhoDeCompras{" +
	        "itens=" + carrinhoList +
	        '}';
	  }
	
	public static void main(String[] args) {
		 // Criando uma instância do carrinho de compras
	    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

	    // Adicionando itens ao carrinho
	    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
	    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
	    carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
	    carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

	    // Exibindo os itens no carrinho
	    carrinhoDeCompras.exibirItens();

	    // Removendo um item do carrinho
	    carrinhoDeCompras.removerItem("Lápis");

	    // Exibindo os itens atualizados no carrinho
	    carrinhoDeCompras.exibirItens();

	    // Calculando e exibindo o valor total da compra
	    System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
	}
}

