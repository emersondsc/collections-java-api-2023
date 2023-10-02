package main.java.set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable <Produto> {

	private String nome;
	private long codigoProduto;
	private Double preco;
	private Integer quantidade;
	
	public Produto(String nome, long codigoProduto, Double preco, Integer quantidade) {
		
		this.nome = nome;
		this.codigoProduto = codigoProduto;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public long getCodigoProduto() {
		return codigoProduto;
	}

	public Double getPreco() {
		return preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	@Override
	public String toString() {
		return "Produto:" + nome + ", codigoProduto=" + codigoProduto + ", preco= " + preco + ", quantidade= "
				+ quantidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoProduto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(codigoProduto, other.codigoProduto);
	}

	
	@Override
	public int compareTo(Produto p) {
		// TODO Auto-generated method stub
		return nome.compareToIgnoreCase(p.getNome());
	}
	
	
}

class ComparadorPorPreco implements Comparator <Produto>{

	@Override
	public int compare(Produto p1, Produto p2) {
		// TODO Auto-generated method stub
		return Double.compare(p1.getPreco(), p2.getPreco());
	}
	
	
}
