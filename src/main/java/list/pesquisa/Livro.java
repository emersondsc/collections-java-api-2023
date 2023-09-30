package main.java.list.pesquisa;

public class Livro {
	 //atributos
	private String titulo;
	private String autor;
	private Integer anoPublicacao;
	
	public Livro(String titulo, String autor, Integer anoPublicacao) {
	
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public Integer getAnoPublicacao() {
		return anoPublicacao;
	}

	@Override
	public String toString() {
		return "CatalogoLivros [titulo=" + titulo + ", autor=" + autor + ", anoPublicacao=" + anoPublicacao + "]";
	}
	
}
