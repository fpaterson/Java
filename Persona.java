package clubSportivoVecinal;

import java.util.ArrayList;


public class Persona {
	
	private String nombre;
	private int edad;
	private ArrayList<Persona> amigos;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		setEdad(edad);
		this.amigos = new ArrayList<>();
	}
	
	public Persona (String nombre) {
		this.nombre = nombre;
		this.amigos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Persona> getAmigos() {		
		return this.amigos;
	}

	public void setEdad(int edad) {
		if (edad > 0 && edad < 130) {
			this.edad = edad;
		}
		else 
			System.out.println("ERROR");
		
	}
	
	public boolean esAmigo (String nombre) {
		boolean resultado = false;
		int index;
		
		for (index = 0; index < this.amigos.size(); index++) {
				if (this.amigos.get(index).getNombre().equals(nombre))
					resultado = true;	
			}
		
		return resultado;	
	}
