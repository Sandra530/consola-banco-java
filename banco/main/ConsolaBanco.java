package banco.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import banco.modelos.Cliente;
import banco.modelos.Gestor;
import banco.modelos.Mensaje;
import banco.modelos.Transferencia;
import banco.modelos.Usuario;
import banco.util.Utiles;

public class ConsolaBanco {

	// atributos de la clase consola

	// simula "base de datos" de gestores
	private List<Gestor> gestores;
    List<Gestor> clientes;
	List<Gestor> transferencias;


	// para garantizar que el id es único
	private Integer siguienteIdGestor;
	private Scanner teclado;

	// inicializamos los atributos en el constructor
	ConsolaBanco() {
		this.gestores = new ArrayList<>();
		this.siguienteIdGestor = 1;
		this.teclado = new Scanner(System.in);
	}

	// main siempre es el punto de entrada a un programa
	public static void main(String[] args) {

		ConsolaBanco consola = new ConsolaBanco();
		consola.iniciar();
	}

	private void iniciar() {

		int opcion;

		do {
			mostrarMenu();

			System.out.print("Selecciona una opción: ");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				insertarGestor();
				break;
			case 2:
				insertarGestoresDePrueba();
				break;
			case 3:
				consultarGestor();
				break;
			case 4:
				mostrarGestores();
				break;
			case 5:
				actualizarGestor();
				break;
			case 6:
				eliminarGestor();
				break;
			case 7:
				insertarCliente();
				break;
			case 8:
				consultarCliente();
			case 9:
				mostrarClientes();
			case 10:
				actualizarCliente();
				break;
			case 11:
				eliminarCliente();
				break;
			case 12:
				insertarMensaje();
				break;
			case 13:
				mostrarMensaje();
				break;
			case 14:
				enviarMensaje();			
			break;
			case 15:
				crearTransferencia ();
				break;
			case 16: mostrarTransferencia ();
				break;
			case 17: enviarTransferencia ();
				break;
			case 18:
				login();
				break;
			case 0:
				cerrar();
				break;
			default:
				System.out.println("Opción desconocida...");
			}

		} while (opcion != 0);
	}
	
	private void insertarCliente() {
		//insertar cliente
		Scanner teclado = new Scanner(System.in);
	    System.out.print("Nombre: ");
	    String nombre = teclado.next();
	    System.out.print("Email: ");
	    String email = teclado.next();
	    System.out.print("Contraseña: ");
	    String pass = teclado.next();
	    
	   System.out.println("Cliente creado con éxito.");
	}
	private void consultarCliente() {
	    System.out.print("Id del cliente a consultar: ");
	    int idCliente = teclado.nextInt();
	    Cliente clienteResultado = buscarClientePorId(idCliente);
	    if (clienteResultado != null) {
	        System.out.println(clienteResultado);
	    } else {
	        System.out.println("No se pudo encontrar un cliente con el id " + idCliente);
	    }
	}
	
	private void mostrarClientes() {
		if (gestores.isEmpty()) {
			System.out.println("Todavía no hay clientes.");
		}
		gestores.forEach(gestor -> {
			System.out.println(gestor);
		});
	}
	private void mostrarMensaje() {
		if (gestores.isEmpty()) {
			System.out.println("Todavía no hay mensajes.");
	}
		Iterable<Gestor> mensajes = null;
		mensajes.forEach(mensaje -> {
			System.out.println(mensaje);
		});
	}
	private void actualizarCliente() {
		System.out.print("Id del cliente a actualizar: ");
		int idCliente = teclado.nextInt();
		Cliente clienteResultado = buscarClientePorId(idCliente);
		if (clienteResultado != null) {
			System.out.println(clienteResultado);
			System.out.println("[n] Nombre");
			System.out.println("[e] Email");
			System.out.println("[c] Contraseña");
			System.out.println("[x] Cancelar");
			System.out.print("Campo a actualizar: ");
			char opcionActualizar = teclado.next().charAt(0);
			switch (opcionActualizar) {
			case 'n':
				System.out.print("Nombre: ");
				String nombre = teclado.next();
				clienteResultado.setUsuario(nombre);
				break;
			case 'e':
				System.out.print("Email: ");
				String email = teclado.next();
				clienteResultado.setCorreo(email);
				break;
			case 'c':
				System.out.print("Contraseña: ");
				String pass = teclado.next();
				clienteResultado.setPassword(pass);
				break;
		
			case 'x':
				System.out.print("Cancelando actualización...");
				break;
			default:
				System.out.println("Opción no válida.");
			}
			if (opcionActualizar != 'x') {
				System.out.println("Se actualizó el gestor con el id " + idCliente);
			}
		} else {
			System.out.println("No se pudo encontrar un gestor con el id " + idCliente);
		}
		
	}
	private void enviarMensaje() {
		System.out.print("Enviar mensaje: ");
		int idMensaje = teclado.nextInt();
	}
	
	private Cliente buscarClientePorId(int idCliente) {
		// TODO Auto-generated method stub
		return null;
	}

	private void login() {
		System.out.print("Id gestor: ");
		int idGestor = teclado.nextInt();
		System.out.print("Contraseña: ");
		String pass = teclado.next();
		Gestor gestor = buscarGestorPorId(idGestor);
		// si el gestor existe
		if (gestor != null) {
			// si la contraseña coincide
			if (gestor.getPassword().equals(pass)) {
				System.out.println("Login correcto!");
			} else {
				System.out.println("Login incorrecto!");
			}
		} else {
			System.out.println("El usuario no existe...");
		}
	}
	private void crearTransferencia() {
		
		System.out.print("Transferencia: ");
		String nombre = teclado.next();
		System.out.print("Nombre: ");
		Transferencia nuevoTransferencia = new Transferencia(siguienteIdGestor, nombre, nombre, nombre, null, siguienteIdGestor);
		transferencias.addAll((Collection<? extends Gestor>) nuevoTransferencia);
		siguienteIdGestor++;
		System.out.println("Transferencia creado con éxito.");
	}
	

	private void mostrarTransferencia() {
		if (gestores.isEmpty()) {
			System.out.println("No hay Transferencias.");
		}
		gestores.forEach(gestor -> {
			System.out.println(gestor);
		});
	}
	private void enviarTransferencia() {
		System.out.print("Enviar transferencia: ");
		String nombre = teclado.next();
		int idTransferencia = teclado.nextInt();
		Transferencia nuevoTransferencia = new Transferencia(siguienteIdGestor, nombre, nombre, nombre, null, siguienteIdGestor);
		System.out.print("Nombre: ");
		System.out.println("Transferencia enviada con éxito.");
	}
	


	private void mostrarMenu() {
		System.out.println("\n1. Insertar gestor");
		System.out.println("2. Insertar gestores de prueba");
		System.out.println("3. Consultar gestor");
		System.out.println("4. Ver todos los gestores");
		System.out.println("5. Actualizar gestor");
		System.out.println("6. Eliminar un gestor");
		System.out.println("7. Inserción de un cliente");
		System.out.println("8. Obtención de un cliente");
		System.out.println("9. Obtención de todos los clientes");
		System.out.println("10. Actualización de un cliente");
		System.out.println("11. Eliminación de un cliente");
		System.out.println("12. Obtención de un mensaje");
		System.out.println("13. Obtención de todos los mensajes");
		System.out.println("14. Envío de un mensaje");
		System.out.println("15. Obtención de una transferencia");
		System.out.println("16. Obtención de todas las trasferencias");
		System.out.println("17. Envío de una transferencia");
		System.out.println("18. Iniciar sesión como gestor");
		System.out.println("0. Salir\n");
	}

	private void insertarGestor() {
		System.out.print("Nombre: ");
		String nombre = teclado.next();
		System.out.print("Email: ");
		String email = teclado.next();
		System.out.print("Contraseña: ");
		String pass = teclado.next();
		System.out.print("Oficina: ");
		String oficina = teclado.next();
		Gestor nuevoGestor = new Gestor(siguienteIdGestor, nombre, pass, email, oficina);
		gestores.add(nuevoGestor);
		siguienteIdGestor++;
		System.out.println("Gestor creado con éxito.");
	}
	private void insertarMensaje() {
		System.out.print("Mensaje: ");
		String mensaje = teclado.next();
	
		Mensaje nuevoMensaje = new Mensaje (siguienteIdGestor,  siguienteIdGestor, siguienteIdGestor, mensaje);
		siguienteIdGestor++;
		System.out.println("Mensaje creado con éxito.");
	}

	private void insertarGestoresDePrueba() {
		System.out.print("Número de gestores: ");
		int numeroGestores = teclado.nextInt();
		for (int i = 0; i < numeroGestores; i++) {
			String usuario = Utiles.nombreAleatorio();
			String correo = Utiles.correoAleatorio();
			Gestor gestor = new Gestor(siguienteIdGestor, usuario, "", correo, "Valencia");
			gestores.add(gestor);
			siguienteIdGestor++;
		}
	}

	private void consultarGestor() {
		System.out.print("Id del gestor a consultar: ");
		int idGestor = teclado.nextInt();
		Gestor gestorResultado = buscarGestorPorId(idGestor);
		// si se ha encontrado
		if (gestorResultado != null) {
			System.out.println(gestorResultado);
		} else {
			System.out.println("No se pudo encontrar un gestor con el id " + idGestor);
		}
	}

	// retorna el gestor con el id si existe, si no, null
	private Gestor buscarGestorPorId(int id) {
		Gestor gestorResultado = null;
		for (int i = 0; i < gestores.size(); i++) {
			Gestor gestor = gestores.get(i);
			if (gestor.getId() == id) {
				gestorResultado = gestor;
				// como ya lo hemos encontrado, rompemos el bucle
				return gestorResultado;
			}
		}
		return null;
	}

	private void mostrarGestores() {
		if (gestores.isEmpty()) {
			System.out.println("Todavía no hay gestores.");
		}
		gestores.forEach(gestor -> {
			System.out.println(gestor);
		});
	}

	private void actualizarGestor() {
		System.out.print("Id del gestor a actualizar: ");
		int idGestor = teclado.nextInt();
		Gestor gestorResultado = buscarGestorPorId(idGestor);
		// si se ha encontrado
		if (gestorResultado != null) {
			System.out.println(gestorResultado);
			System.out.println("[n] Nombre");
			System.out.println("[e] Email");
			System.out.println("[c] Contraseña");
			System.out.println("[o] Oficina");
			System.out.println("[x] Cancelar");
			System.out.print("Campo a actualizar: ");
			char opcionActualizar = teclado.next().charAt(0);
			switch (opcionActualizar) {
			case 'n':
				System.out.print("Nombre: ");
				String nombre = teclado.next();
				gestorResultado.setUsuario(nombre);
				break;
			case 'e':
				System.out.print("Email: ");
				String email = teclado.next();
				gestorResultado.setCorreo(email);
				break;
			case 'c':
				System.out.print("Contraseña: ");
				String pass = teclado.next();
				gestorResultado.setPassword(pass);
				break;
			case 'o':
				System.out.print("Oficina: ");
				String oficina = teclado.next();
				gestorResultado.setOficina(oficina);
				break;
			case 'x':
				System.out.print("Cancelando actualización...");
				break;
			default:
				System.out.println("Opción no válida.");
			}
			if (opcionActualizar != 'x') {
				System.out.println("Se actualizó el gestor con el id " + idGestor);
			}
		} else {
			System.out.println("No se pudo encontrar un gestor con el id " + idGestor);
		}
	}

	private void eliminarGestor() {
		System.out.print("Id del gestor a eliminar: ");
		int idGestor = teclado.nextInt();
		Gestor gestorResultado = null;
		int posicionGestor = -1;
		for (int i = 0; i < gestores.size(); i++) {
			Gestor gestor = gestores.get(i);
			if (gestor.getId() == idGestor) {
				gestorResultado = gestor;
				posicionGestor = i;
				// como ya lo hemos encontrado, rompemos el bucle
				break;
			}
		}
		// si se ha encontrado
		if (gestorResultado != null) {
			gestores.remove(posicionGestor);
			System.out.println("Se eliminó el gestor con el id " + idGestor);
		} else {
			System.out.println("No se pudo encontrar un gestor con el id " + idGestor);
		}
		
	}
private void eliminarCliente() {
	System.out.print("Id del gestor a eliminar: ");
	int idCliente = teclado.nextInt();
	Cliente clienteResultado = null;
	int posicionCliente = -1;
	for (int i = 0; i < clientes.size(); i++) {
		Usuario cliente = null;
		if(cliente.getId() == idCliente) {
			clienteResultado = (Cliente) cliente;
			posicionCliente = i;
			break;
	
		}
	}
	
}
	private void cerrar() {
		teclado.close();
		System.out.println("¡Hasta pronto!");
	}

}

