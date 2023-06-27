package excepciones;


public class PruebaExcepciones {
	
	public PruebaExcepciones() {
		
	}
	public static int sumarPositivos (int a, int b) throws NumeroNoPositivoException{
		if(a<0) {
			throw new NumeroNoPositivoException("El primer parámetro debe ser positivo");
		}
		if(b < 0) {
			throw new NumeroNoPositivoException("El segundo parámetro debe ser positivo");

	}
		return b;
	}
}
