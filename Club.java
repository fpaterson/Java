package clubSportivoVecinal;

import java.util.ArrayList;

public class Club {
	
	private String nombre;
	private ArrayList<Persona> socios;
	
	public Club(String nombre) {
		this.nombre = nombre;
		socios = new ArrayList<>();
	}
	
	public Resultado agregarSocio(String nombre, int edad) {
		Persona SocioAAgregar = null;
		Resultado resu = Resultado.YA_EXISTE;	
		
		SocioAAgregar = buscarPersona(nombre);
		
		if (SocioAAgregar == null) {
			this.socios.add(new Persona(nombre, edad));
			resu = Resultado.OK;
		}
		return resu;
	}
	
	
	// método auxiliar de agregarSocio, llamado buscarPersona
	private Persona buscarPersona(String nombre) {
		Persona personaEncontrada = null;
		int pos = 0;

		while (pos < this.socios.size() && personaEncontrada == null)
			if (this.socios.get(pos).getNombre().equals(nombre))														
				personaEncontrada = this.socios.get(pos); 
			else
				pos++;

		return personaEncontrada;
	}

	
	public Resultado establecerAmistad(String nombre1, String nombre2) {
		Resultado resu = Resultado.NOMBRES_IGUALES;
		Persona persona1 = new Persona("nombre1");
		Persona persona2 = new Persona("nombre2");
		int index;
		
		// Utiliza el método auxiliar esAmigo, de la clase Persona. Si no es amigo, puede establecer amistad, si lo es, no
		
		if (persona1.getAmigos() == null) {
			persona1.getAmigos().add(persona2);
			persona2.getAmigos().add(persona1);
			resu = Resultado.OK;
		}
		
		else if (!persona1.esAmigo(persona2.getNombre())){
			persona1.getAmigos().add(persona2);
			persona2.getAmigos().add(persona1);		
			resu = Resultado.OK;				
		}
		
		else if (persona1.esAmigo(persona2.getNombre()))
				resu = Resultado.YA_SON_AMIGOS;
			
		//utiliza buscarPersona en el nombre de cada persona creada
		else if (buscarPersona(persona1.getNombre()) == null || buscarPersona(persona2.getNombre()) == null)
			resu = Resultado.NO_EXISTE;
			
		return resu;
	}

		
	
			
				
		
		
	}
