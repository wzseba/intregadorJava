package integrador;

import java.util.List;

public class Promedios {

	/*
	 * Implementar un metodo que reciba una coleccion de personas e indique para un
	 * rango de edades el promedio de hijos que tienen las personas de dicho rango.
	 * considerar el caso de que no haya personas en ese rango de edades
	 * ArithmeticException
	 */

	public static Integer getHijosPromedio(List<Persona> personas, Integer desdeEdad, Integer hastaEdad) {
		
		if (desdeEdad < 0 || hastaEdad < 0 || desdeEdad > hastaEdad) {
			throw new IllegalArgumentException("Rango de edades no válido");
		}

		int contador = 0;
		int acumuladorDeHjios = 0;

		for (Persona persona : personas) {
			if (persona.getEdad() >= desdeEdad && persona.getEdad() <= hastaEdad) {
				acumuladorDeHjios += persona.getCantidadHijos();
				contador++;
			}
		}
		
		if (contador == 0) {
            throw new ArithmeticException("No hay personas en el rango de edades proporcionado");
        }

		return acumuladorDeHjios / contador;
	}
	
	public static void main(String[] args) {
		
		Persona pedro = new Persona(25,2);
		Persona lucas = new Persona(20,1);
		Persona juan = new Persona(28,3);
		
		
		List<Persona> listaPersonas = List.of(pedro, lucas, juan);
		
		try {
			Integer promedio = Promedios.getHijosPromedio(listaPersonas, 40, 78);
			System.out.println("El promedio de hijos es de: " + promedio);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
