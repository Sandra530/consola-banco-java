package banco.pruebas;
import java.util.ArrayList;
import java.util.List;

import Copia.Gestor;
import banco.util.Utiles;

public class PruebaUtil {

	public static void main(String[] args) {
		String nombreAleatorio = Utiles.nombreAleatorio(Utiles.NOMBRES, Utiles.APELLIDOS);
		
		System.out.println(nombreAleatorio);
		
		nombreAleatorio = Utiles.nombreAleatorio();
		
		System.out.println(nombreAleatorio);
		
		String[] nombres = {"Jose", "Lucía", "Marta", "John"};
		String[] apellidos = {"Albert", "García", "Esteve", "Cervera"};

 		
		nombreAleatorio = Utiles.nombreAleatorio(nombres, apellidos);
		
		System.out.println(nombreAleatorio);
		
		
		//Correos
		
		String correoAleatorio = Utiles.correoAleatorio(Utiles.CORREOS, Utiles.DOMINIOS);
		
		System.out.println(correoAleatorio);

	
	
	//guardar gestores
		List<Gestor> gestores = new ArrayList<>();
		
		for(int i = 0; i <10; i++) {
			String usuario = Utiles.nombreAleatorio();
			String correo = Utiles.correoAleatorio ();
			Gestor gestor = new Gestor (i+1, usuario, "", correo );
			gestores.add(gestor);
			
		}
		
		
		System.out.println(gestores);
	}
}

		
		
		
		
		

