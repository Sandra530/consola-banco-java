package banco.modelos;

import java.util.Date;

public class Mensaje {

	public Mensaje() {
	}
	
	private Integer id;
	private Integer origen;
	private Integer destino;
	private String texto;
	private Date fecha;
	
	public Mensaje(Integer id, Integer origen, Integer destino, String texto) {
		this.id = id;
		this.origen = origen;
		this.destino = destino;
		this.texto = texto;
		this.fecha = new Date();
		
	
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrigen() {
		return origen;
	}

	public void setOrigen(Integer origen) {
		this.origen = origen;
	}

	public Integer getDestino() {
		return destino;
	}

	public void setDestino(Integer destino) {
		this.destino = destino;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}


	
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String toString() {
		return "Mensaje{origen: " + this.origen + ", destino: " + this.destino + "}";
	}
	
	
	

		
	
	public boolean equals(Object o) {
		Mensaje m = (Mensaje) o;
		boolean mismoId = this.id == m.id;
		return mismoId;
	
}
	
}
