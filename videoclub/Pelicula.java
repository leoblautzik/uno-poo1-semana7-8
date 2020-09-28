package uno.videoclub;

public class Pelicula extends VideoArticulo {
	
	private Integer anio;
	private String director;
	
	public Pelicula() {
		super();
		this.anio=0;
		this.director="";	
	}
	
	public Pelicula(String titulo, String director) {
		super(titulo);
		this.director=director;
	}
	
	public Pelicula(String titulo, String director, int anio, String genero) {
		super(titulo, genero);
		this.director=director;
		this.anio=anio;
	}

	@Override
	public int compareTo(VideoArticulo otraPelicula) {
		Pelicula unaPelicula = (Pelicula) otraPelicula;
		return this.anio.compareTo(unaPelicula.anio);
	}

	@Override
	public String toString() {
		return "Pelicula [anio=" + anio + ", director=" + director + ", getTitulo()=" + getTitulo() + ", getGenero()="
				+ getGenero() + "]";
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
}
