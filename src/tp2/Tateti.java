package tp2;

import java.util.Random;
import estructurasDeDatos.ListaSimplementeEnlazada;
import estructurasDeDatos.Cola;

public class Tateti {

	private Tablero tablero;
	private ListaSimplementeEnlazada<Jugador> jugadores;
	private Cola<Carta> mazo;
	private int maxCartasEnMano;
	private Random dado;
	
	public Tateti(int n, int m, int z, int maxCartasEnMano, int cantidadFichas, int cantidadJugadores) {
		this.tablero = new Tablero(n, m, z);
		this.jugadores = new ListaSimplementeEnlazada<>();
		this.mazo = new Cola<>();
		this.maxCartasEnMano = maxCartasEnMano;
		this.dado = new Random();
	
		for(int i = 1; i <= cantidadJugadores; i++) {
			Jugador jugador = new Jugador("Jugador " + i, i, "Color" + i, cantidadFichas);
			try {
				jugadores.agregar(jugador);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	//Crear cartas y añadirlas al mazo.
	
	private int tirarDado() {
		return dado.nextInt(6) + 1;
	}
	
	
}
