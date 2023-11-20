package integrador;

public class Libro {
	/* implementar class libro solo con los metodos necesarios */

	private String titulo;
	private String autor;
	
	public Libro(String titulo, String autor) {
		this.autor = autor;
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	// M�todo para comparar libros por t�tulo
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Libro otroLibro = (Libro) obj;
        return titulo.equals(otroLibro.titulo);
    }
	

}
