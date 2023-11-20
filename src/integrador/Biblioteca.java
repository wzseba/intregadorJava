package integrador;

public class Biblioteca {
	/*
	 * implementar el metodo contieneElLibro, tal que dada una matriz de libros de
	 * dos dimensiones , indicar si contiene un libro dado
	 */
	
	public boolean contieneElLibro(Libro [][] libros, Libro libroBuscado) {
		
		for (Libro[] fila : libros) {
			for (Libro libro : fila) {
				if(libro != null && libro.equals(libroBuscado)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		Libro terminator = new Libro("terminator","sebas");
        Libro superman = new Libro("superman","gaston");
        Libro batman = new Libro("batman","pedro");
        Libro noEsta = new Libro("noEsta","lolo");
        Libro terminator2 = new Libro("Terminator","lolo");
		
     // Crear una matriz de libros
        Libro[][] matrizDeLibros = {
                {terminator, superman},
                {batman},
                {terminator2}
                };
        
     // Crear una instancia de la Biblioteca
        Biblioteca biblioteca = new Biblioteca();
        
     // Verificar si la biblioteca contiene un libro específico
        if (biblioteca.contieneElLibro(matrizDeLibros, terminator2)) {
            System.out.println("La biblioteca tiene el libro");
        } else {
            System.out.println("La biblioteca no tiene el libro");
        }
        
//        int[][] matrizDeEnteros = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12}
//        };
//
//        // Imprimir la matriz
//        for (int i = 0; i < matrizDeEnteros.length; i++) {
//            for (int j = 0; j < matrizDeEnteros[i].length; j++) {
//                System.out.print(matrizDeEnteros[i][j] + " ");
//            }
//            System.out.println(); // Salto de línea después de cada fila
//        }
		
		
	}
}
