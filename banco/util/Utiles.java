package banco.util;

import java.util.Random;

public class Utiles {
	
	public static final String [] NOMBRES = {"Juan", "Alex", "Silvia", "Irene"};
	
	public static final String [] APELLIDOS = {"Perez", "Martín", "López", "Cervera", "Uta"};
	
	public static String nombreAleatorio(String[] nombres, String[] apellidos) {
		
		Random random = new Random();
		int indiceNombre = random.nextInt(nombres.length);
		String nombre = nombres[indiceNombre];
		
		int indiceApellidos = random.nextInt(apellidos.length);
		String apellido = apellidos[indiceApellidos];
		
		return nombre + " " + apellido;
		
		 
	}
	public static String nombreAleatorio() {
		return nombreAleatorio(NOMBRES, APELLIDOS);
		
	}
	
	
	//retornar un email aleatorio
	//completar
	
	public static final String [] CORREOS = {"jperez", "amartin", "eladio", "egomez"} ;
	
	public static final String [] DOMINIOS = {"gmail.com", "hotmail.com", "yahoo.com", "ejemplo.com"};
	
	
	public static String correoAleatorio(String[]correos, String[] dominios) {
		Random random = new Random();
		int indiceCorreos = random.nextInt(correos.length);
		String correo = correos [indiceCorreos];
		
		int indiceDominios = random.nextInt(dominios.length);
		String dominio = dominios[indiceDominios];
		 
		return correo + "@" + dominio;
					
	}
	
	public static String correoAleatorio() {
		return correoAleatorio (CORREOS, DOMINIOS);
		
	}

	// correos combinando nombres, apellidos y dominios
		public static String correoAleatorio(String[] nombres, String[] apellidos, String[] dominios) {
			// generador de aleatorios
			Random random = new Random();

			// índice aleatorio en el rango de la lista de nombres
			int indiceNombre = random.nextInt(nombres.length);
			String nombre = nombres[indiceNombre];

			int indiceApellidos = random.nextInt(apellidos.length);
			String apellido = apellidos[indiceApellidos];

			int indiceDominio = random.nextInt(dominios.length);
			String dominio = dominios[indiceDominio];

			return nombre.toLowerCase() + "." + apellido.toLowerCase() + "@" + dominio;
		}

	}

