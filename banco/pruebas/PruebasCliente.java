package banco.pruebas;

import banco.modelos.Cliente;

public class PruebasCliente {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(1, "Paco", "1234", "correo@correo.es", 200.0, 1);
		
		System.out.println(cliente);

	}

}
