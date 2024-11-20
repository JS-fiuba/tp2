package estructurasDeDatos;

public class Nodo<T> {

	private T dato;
	private Nodo<T> siguiente = null;

	Nodo(T dato) {
		this.dato = dato;
		this.siguiente = null;
	}
	
	T getDato() {
		return this.dato;
	}

	Nodo<T> getSiguiente() {
		return this.siguiente;
	}

	void setDato(T dato) {
		this.dato = dato;
	}

	void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}

}