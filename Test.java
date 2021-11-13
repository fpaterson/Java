	public static void main(String[] args) {
		
		Club river = new Club("River Plate");
		
		System.out.println(river.agregarSocio("Juan", 23));
		System.out.println(river.agregarSocio("Laura", 18));	
		System.out.println(river.agregarSocio("Maria", 26));
		System.out.println(river.agregarSocio("Joaquín", 20));
		System.out.println(river.agregarSocio("Belen", 20));
		System.out.println(river.agregarSocio("Daniel", 21));
		System.out.println(river.agregarSocio("Valeria", 20));
		System.out.println(river.agregarSocio("Ana", 19));
		System.out.println(river.agregarSocio("Javier", 22));
		System.out.println(river.agregarSocio("Javier", 22));
		System.out.println("--------------------------------------");
		
		Persona juan = new Persona("Juan", 23);
		Persona ana = new Persona("Ana", 19);
		
		System.out.println(river.establecerAmistad("Juan", "Ana"));

	
	}

}
