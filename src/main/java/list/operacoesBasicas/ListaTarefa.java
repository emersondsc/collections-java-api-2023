package main.java.list.operacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	//atributo
	private List<Tarefa> tarefaList;

	public ListaTarefa() {
		this.tarefaList = new ArrayList<>();
	}

	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for(Tarefa t : tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
			tarefaList.removeAll(tarefasParaRemover);
		}
	}
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
		
	}
	public void obtertDescriçõesTarefas() {
		System.out.println(tarefaList);
	}
	
	//Método Main para executar o código
	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		
		 System.out.println(listaTarefa.obterNumeroTotalTarefas());
	listaTarefa.adicionarTarefa ("Escovar os Dentes");
	listaTarefa.adicionarTarefa ("Escovar os Dentes");
	listaTarefa.adicionarTarefa ("Escovar os Dentes");
	System.out.println(listaTarefa.obterNumeroTotalTarefas());
	listaTarefa.removerTarefa("Escovar os Dentes");
	System.out.println(listaTarefa.obterNumeroTotalTarefas());
	listaTarefa.obtertDescriçõesTarefas();
	}
}
