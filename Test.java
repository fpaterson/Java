package clubSportivoVecinal;

public class Test {

	public static void main(String[] args) {
		
		Club river = new Club("River Plate");
		
		System.out.println(river.agregarSocio("Juan", 23));
		System.out.println(river.agregarSocio("Laura", 18));	
		System.out.println(river.agregarSocio("Maria", 26));
		System.out.println(river.agregarSocio("Joaquin", 20));
		System.out.println(river.agregarSocio("Belen", 20));
		System.out.println(river.agregarSocio("Daniel", 21));
		System.out.println(river.agregarSocio("Valeria", 20));
		System.out.println(river.agregarSocio("Ana", 19));
		System.out.println(river.agregarSocio("Javier", 22));
		System.out.println(river.agregarSocio("Javier", 22));
		System.out.println("--------------------------------------");
		
		
		System.out.println(river.establecerAmistad("Juan", "Ana"));
		System.out.println(river.establecerAmistad("Laura", "Ana"));
		System.out.println(river.establecerAmistad("Laura", "Juan"));
		System.out.println(river.establecerAmistad("Maria", "Ana"));
		System.out.println(river.establecerAmistad("Belen", "Joaquin"));
		System.out.println(river.establecerAmistad("Belen", "Daniel"));
		System.out.println(river.establecerAmistad("Valeria", "Ana"));
		System.out.println(river.establecerAmistad("Ana", "Daniel"));
		System.out.println(river.establecerAmistad("Ana", "Daniel"));
		System.out.println(river.establecerAmistad("Javier", "Juan"));
		System.out.println(river.establecerAmistad("Javier", "Ana"));
		System.out.println(river.establecerAmistad("Ana", "Javier"));
		System.out.println(river.establecerAmistad("Ana", "Ana"));
		System.out.println(river.establecerAmistad("Laura", "Marcelo"));
		System.out.println(river.establecerAmistad("Toribio", "Ana"));
		
		
		
		
		//System.out.println(river.devolverNombreEdadAmigos("Ana"));
		

	
	}

}

