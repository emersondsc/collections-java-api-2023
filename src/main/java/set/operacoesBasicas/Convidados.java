package main.java.set.operacoesBasicas;

import java.util.Objects;

public class Convidados {
	//atributos
	private String nome;
	private Integer	codigoConvite;
	
	
	
	public Convidados(String nome, Integer codigoConvite) {
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}
	public String getNome() {
		return nome;
	}
	public Integer getCodigoConvite() {
		return codigoConvite;
	}
	
	@Override
	public String toString() {
		return "Convidados [nome=" + nome + ", codigoConvite=" + codigoConvite + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigoConvite);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidados other = (Convidados) obj;
		return Objects.equals(codigoConvite, other.codigoConvite);
	}
	
	

}
