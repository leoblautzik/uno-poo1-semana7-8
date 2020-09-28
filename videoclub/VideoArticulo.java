package uno.videoclub;

public abstract class VideoArticulo implements Entregable, Comparable<VideoArticulo> {
	
	private String titulo;
	private String genero;
	private Boolean entregado;
	
	public VideoArticulo() {
		this("");
	}
	
	public VideoArticulo(String titulo) {
		this(titulo,"no definido");
	}
	
	public VideoArticulo(String titulo, String genero) {
		this.titulo=titulo;
		this.genero=genero;
		this.entregado=false;		
	}
	
	
	
	//public abstract int compareTo(VideoArticulo o); 
	public abstract String  toString();
		
	@Override
	public void entregar() {
		this.entregado=true;
		
	}
	@Override
	public void devolver() {
		this.entregado=false;
		
	}
	@Override
	public boolean isEntregado() {
		return this.entregado;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	

}
