package uno.videoclub;

public class Serie extends VideoArticulo {
	
	private Integer numeroDeTemporadas;
	private String creador;
	
	public Serie() {
		this("","",3,"");
	}
	
	public Serie(String titulo, String creador) {
		this(titulo,creador,3,"");
	}
	
	public Serie(String titulo, String creador, int numeroDeTemporadas, String genero) {
		super(titulo, genero);
		this.numeroDeTemporadas=numeroDeTemporadas;
		this.creador=creador;
		
	}

	@Override
	public int compareTo(VideoArticulo otraSerie) {
		Serie unaSerie = (Serie) otraSerie;
		return this.numeroDeTemporadas.compareTo(unaSerie.numeroDeTemporadas);

	}


	@Override
	public String toString() {
		return "Serie [numeroDeTemporadas=" + numeroDeTemporadas + ", creador=" + creador + ", getTitulo()="
				+ getTitulo() + ", getGenero()=" + getGenero() + "]";
	}

	public Integer getNumeroDeTemporadas() {
		return numeroDeTemporadas;
	}

	public void setNumeroDeTemporadas(Integer numeroDeTemporadas) {
		this.numeroDeTemporadas = numeroDeTemporadas;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	

}
