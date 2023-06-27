package banco.pruebas;
import banco.modelos.Gestor;

import banco.modelos.Mensaje;

public class PruebasGestor {

	public static void main(String[] args) {
		Gestor gestor = new Gestor (1, "Paco", "1234", "paco@correo.com");
		gestor.setOficina("Valencia");
		
		//alternativa sin parametros en el constructor
		Gestor gestorB = new Gestor();
		gestorB.setId(2);
		gestorB.setUsuario("Ana");
		gestorB.setPassword("4321");
		gestorB.setCorreo("ana@correo.com");

		System.out.println(gestor);
		
		if(gestor.equals(gestorB)) {
			System.out.println("Son el mismo gestor");
		}else {
			System.out.println("Son gestores distintos");
		}
			
		Mensaje mensaje = new Mensaje (5, 9, 7, "Texto mensaje");
		
		System.out.println(mensaje);

	
	}
	

}
