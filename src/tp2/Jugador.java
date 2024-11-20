package tp2;

import estructurasDeDatos.ListaSimplementeEnlazada;

public class Jugador {

	private String nombre;
	private int id;
	private String color;
	private ListaSimplementeEnlazada<Carta> cartasEnMano;
	private int fichasRestantes;
	
	public Jugador(String nombre, int id, String color, int cantidadFichas) {
		this.nombre = nombre;
		this.id = id;
		this.color = color;
		this.fichasRestantes = cantidadFichas;
		this.cartasEnMano = new ListaSimplementeEnlazada<>();
	}
	
	public void usarFicha() {
		if(fichasRestantes > 0) {
			fichasRestantes--;
		}
	}
	
	public void agregarCarta(Carta carta) throws Exception {
		cartasEnMano.agregar(carta);
	}
	
	public void mostrarCartas() {
		cartasEnMano.iniciarCursor();
		while(cartasEnMano.avanzarCursor()) {
			System.out.println(cartasEnMano.obtenerCursor());
		}
	}
	
	
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public int getFichasRestantes() {
        return fichasRestantes;
    }
	
   
}
