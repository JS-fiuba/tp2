package estructurasDeDatos;

public class ListaSimplementeEnlazada<T> extends Lista<T> {
//ATRIBUTOS DE CLASE --------------------------------------------------------------------------------------
//ATRIBUTOS -----------------------------------------------------------------------------------------------
//CONSTRUCTORES -------------------------------------------------------------------------------------------
//METODOS DE CLASE ----------------------------------------------------------------------------------------
//METODOS GENERALES ---------------------------------------------------------------------------------------
//METODOS DE COMPORTAMIENTO -------------------------------------------------------------------------------
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Nodo<T> actual = this.getPrimero();
		while(actual != null) {
			sb.append(actual.getDato()).append(" -> ");
			actual = actual.getSiguiente();
		}
		sb.append("null");
		return sb.toString();
	}
	
	/**
	 * pre: posición pertenece al intervalo: [1, contarElementos() + 1]
	 * pos: agrega el elemento en la posición indicada.
	 */
	public void agregar(T elemento, int posicion) throws Exception {
		validarPosicion(posicion);
		Nodo<T> nuevo = new Nodo<T>(elemento);
		if (posicion == 1) {
			nuevo.setSiguiente( this.getPrimero());
			this.setPrimero( nuevo );
		} else {
			Nodo<T> anterior = this.getNodo(posicion -1);
			nuevo.setSiguiente( anterior.getSiguiente());
			anterior.setSiguiente( nuevo );
		}
		this.aumentarTamanio();
	}
	
	/*
	 * pre : posición pertenece al intervalo: [1, contarElementos()]
	 * post: remueve de la Lista el elemento en la posición indicada.
	 */
	public void remover(int posicion) throws Exception {
		validarPosicion(posicion);
		this.iniciarCursor();
		Nodo<T> removido = null;
		if (posicion == 1) {
			removido = this.getPrimero();
			this.setPrimero( removido.getSiguiente() );
		} else {
			Nodo<T> anterior = this.getNodo(posicion -1);
			removido = anterior.getSiguiente();
			anterior.setSiguiente( removido.getSiguiente());
		}
		this.disminuirTamanio();
	}

	public void remover(T valor) throws Exception {
		Nodo<T> cursor = this.getPrimero();
		int posicion = 1;
		while (cursor != null) {
			if (cursor.getDato().equals(valor)) {
				remover(posicion);
				return;
			}
			cursor = cursor.getSiguiente();
			posicion++;
		}
		throw new Exception("El valor '" + valor + "' no existe");
	}
	
	public int buscar(T valor) {
		Nodo<T> cursor = this.getPrimero();
		int posicion = 1;
		while(cursor != null) {
			if(cursor.getDato().equals(valor)) {
				return posicion;
			}
			cursor = cursor.getSiguiente();
			posicion++;
		}
		return -1;
	}
	
//GETTERS SIMPLES -----------------------------------------------------------------------------------------
//SETTERS SIMPLES -----------------------------------------------------------------------------------------	

}