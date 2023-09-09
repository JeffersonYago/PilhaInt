package model;

public class PilhaInt {

	Nó topo;
	
	public PilhaInt() {
		topo = null;
	}
	
	public boolean isEmpty() {
		if (topo == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void Push(int Valor) {
		Nó elemento = new Nó();
		elemento.dado = Valor;
		elemento.Próximo = topo;
		topo = elemento;
		
	}
	
	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Pilha vazia");
		}
		int Valor = topo.dado;
		topo = topo.Próximo;
		return Valor;
		
	}
	public int top() throws Exception{
		if (isEmpty()) {
			throw new Exception("Pilha vazia");
		}
		int Valor = topo.dado;
		return Valor;
	}
	public int size() {
		int cont = 0;
		if(!isEmpty()) {
			Nó aux = topo;
			while(aux != null) {
				cont++;
				aux = aux.Próximo;
			}
		}
		return cont;
	}
}