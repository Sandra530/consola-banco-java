package banco.modelos;


public class Transferencia {
	
	private Integer idGestor;
	private Double saldo;
	private String id;
	private String usuario;

			public Transferencia(Integer id, String usuario, String password, String correo, Double saldo, Integer idGestor) {
			super ();
			this.saldo = saldo;
			this.idGestor = idGestor;
	}
		public Integer getIdGestor() {
			return idGestor;
		}
		public void setIdGestor(Integer idGestor) {
			this.idGestor = idGestor;
		}
		public Double getSaldo() {
			return saldo;
		}
		public void setSaldo(Double saldo) {
			this.saldo = saldo;
		
	}
		public String toString() {
			return "Transferencia{id: "+ this.id + " , nombre: " + this.usuario + ", saldo: " + "}";
		}
		}
