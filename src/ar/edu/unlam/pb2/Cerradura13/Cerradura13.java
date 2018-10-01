package ar.edu.unlam.pb2.Cerradura13;

public class Cerradura13 {
	//Atributos
	private Integer claveCorrecta;
	private Integer intentos;
	private Integer contadorAperturas=0;
	private Integer contadorFallidas=0;
	private Boolean estadoCerradura=false;
	private Boolean seBloqueo=false;
	
	
	//Constructor
	public Cerradura13 (Integer clave, Integer cantidad) {
		this.claveCorrecta = clave;
		this.intentos = cantidad;
	}
	
	
	//Metodos
	
	//abrir
	public Boolean abrir(Integer clave) {
		if(this.claveCorrecta.equals(clave) && seBloqueo==false) {
			this.estadoCerradura=true;
			this.contadorAperturas+=1;
			this.contadorFallidas=0;
		} else 
			this.contadorFallidas+=1;
			if(contadorFallidas>=this.intentos) {
				this.seBloqueo=true;
				
			}
		return estadoCerradura;
	}
	
	//cerrar
	public Boolean cerrar() {
		estadoCerradura=false;
		return this.estadoCerradura;
	}
	
	//estacerrada
	public Boolean estaCerrada(){
		return !this.estadoCerradura;
	}
	
	//seBloqueo
	public Boolean seBloqueo(){
		return this.seBloqueo;
	}
	
	//contarAperturas
	public Integer contarAperturas() {
		return this.contadorAperturas;
	}
	
	//contarFallidos
	public Integer contarFallidas() {
		return this.contadorFallidas;
	}
}
