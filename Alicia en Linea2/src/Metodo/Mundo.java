package Metodo;
import java.util.ArrayList;

public class Mundo {
	private ArrayList<Persona> LosPersonajes = new ArrayList<>();
	
	public ArrayList<Persona> getLosPersonajes(){
		return LosPersonajes;
	}
	public void agregarPersona(Persona p) {
		this.LosPersonajes.add(p);
	}
	
	public int personajeLindo(){
		ArrayList<Persona> LosPersonajesLindos = new ArrayList<>();
		for(Persona p: LosPersonajes) {
			if(p.determinarLindo() == true) {
				LosPersonajesLindos.add(p);
			}
		}	
		return LosPersonajesLindos.size();
	}
	
	public ArrayList<Persona> personajeNormal(){
		ArrayList<Persona> LosPersonajesNormal = new ArrayList<>();
		for(Persona p: LosPersonajes) {
			if(p.determinarNormal() == true) {
				LosPersonajesNormal.add(p);
			}
		}	
		return LosPersonajesNormal;
	}
	
	
	public int PersonajesMaravilla() {
		int estaEnMaravilla = 0;
		for(Persona p: LosPersonajes) {
			if(p.determinarUbicacion() == true) {
				estaEnMaravilla = estaEnMaravilla + 1;
			}
		}
		return estaEnMaravilla;
	}
	
	public boolean personajesLindosNormales() {
		if(personajeNormal().size() < personajeLindo())
		{
			return true;
		}
		else return false;
		
	}
	
	public boolean determinarPersonajesNormales() {
		ArrayList<Persona> LosPersonajesNormal = new ArrayList<>();
		
		LosPersonajesNormal = personajeNormal();
		
		if(LosPersonajesNormal.size() >= 1) {
			return true;
		}else return false;
			
	}
	public int mayorLocura() {
		int mayorLoc = 0;
		for(Persona p: LosPersonajes) {
			if(mayorLoc < p.getLocuraPers()) {
				mayorLoc = p.getLocuraPers();
			}
		}
		
		return mayorLoc;
	}
	public Persona personajeConMayorLocura(){
		Persona PersonajeMayorLocura = new Persona();
		for(Persona p: LosPersonajes) {
			if(p.getLocuraPers() == mayorLocura()) {
				PersonajeMayorLocura = p;
			}
		}
		return PersonajeMayorLocura;
	}
}
