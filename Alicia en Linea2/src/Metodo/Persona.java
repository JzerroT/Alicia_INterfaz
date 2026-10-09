package Metodo;

public class Persona {
	private int locuraPers;
	private int secretosPers;
	private int maximoLocura;
	private int id=1;
	private int ubicacionAsociada;
	
	public Persona() {
		
	}
	public Persona(int locuraPers, int secretosPers,int maximoLocura,int ubicacionAsociada) {
		this.locuraPers = locuraPers;
		this.secretosPers = secretosPers;
		this.maximoLocura = maximoLocura;
		this.ubicacionAsociada = ubicacionAsociada;
	}
	
	public Persona(int locuraPers, int secretosPers,int ubicacionAsociada) {
		this.locuraPers = locuraPers;
		this.secretosPers = secretosPers;
		this.ubicacionAsociada = ubicacionAsociada;
		this.id+=1;
	}
	
	public int getLocuraPers() {
		return locuraPers;
	}
	
	public int getsecretosPers() {
		return secretosPers;
	}
	
	public int getubicacionAsociada() {
		return ubicacionAsociada;
	}
	
	public int getMaximoLocura() {
		return maximoLocura;
	}
	
	public void setMaximoLocura(int maximoLocura) {
		this.maximoLocura =maximoLocura;
	}
	public void setLocuraPers(int locuraPers) {
		this.locuraPers = locuraPers;
	}
	
	public void setsecretosPers(int secretosPers) {
		this.secretosPers = secretosPers;
	}
	
	public void setubicacionAsociada(int ubicacionAsociada)
	{
		this.ubicacionAsociada = ubicacionAsociada;
	}
	public void embellecer(int sumaLocura) {
		locuraPers += sumaLocura;
		secretosPers -= 10;
	}
	
	public boolean determinarUbicacion() {
		if(ubicacionAsociada <= -1) {
			return true;
		}else return false;
	}
	
	public boolean determinarLindo() {
		if(locuraPers >= maximoLocura*0.75 && determinarUbicacion()) {
			return true;
		}else return false;
	}
	
	public boolean determinarNormal() {
		if(locuraPers < 10 && secretosPers >= 500) {
			return true;
		}else return false;
	}
	
	public int getId() {
		return id;
	}

}
