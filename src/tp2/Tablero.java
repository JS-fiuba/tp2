package tp2;

public class Tablero {

	private int[][][] tablero;
	private int n, m, z;
	
	public Tablero(int n, int m, int z) {
		this.n = n;
		this.m = m;
		this.z = z;
		this.tablero = new int[n][m][z];
		iniciarTablero();
	}
	
	public void iniciarTablero() {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				for(int k = 0; k < z; k++) {
					tablero[i][j][k] = 0;
				}
			}
		}
	}
	
	public boolean colocarFicha(int jugadorFicha, int x, int y, int z) {
		if(x >= 0 && x < n && y >= 0 && y < m && z >= 0 && z < z && tablero[x][y][z] == 0) {
			tablero[x][y][z] = jugadorFicha;
			return true;
		}
		
		return false;
	}
	
	public int getPosicion(int x, int y, int z) {
		return tablero[x][y][z];
	}
	
}
