package excepciones;


import java.util.Scanner;




public class MainExcepciones {



public static void main (String [] args) throws Exception {

Scanner teclado = new Scanner(System.in);

System.out.print("Introduce un numero: ");

try {
	int numeroEntero = teclado.nextInt();
	System.out.println("Numero x 2 = " + numeroEntero * 2);
	
	}catch (Exception e) {
	System.out.println("No se pudo leer ningun numero...");
	e.printStackTrace();
	
	}finally {
		teclado.close();
	}
try {
	int suma = PruebaExcepciones.sumarPositivos(-1, 4);
	System.out.println("Resultado" + suma);

	} catch (Exception e){
		e.printStackTrace();
	}
		
	}
}
