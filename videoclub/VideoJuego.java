package uno.videoclub;

public class VideoJuego extends VideoArticulo {
	
	private Integer horasEstimadas;
	private String compania;
	
	public VideoJuego() {
		this("",10, "", "");
	}
	
	public VideoJuego(String titulo, int horasEstimadas) {
		this(titulo, horasEstimadas, "","");
	}
	
	public VideoJuego(String titulo, int horasEstimadas, String compania, String genero) {
		super(titulo, genero);
		this.horasEstimadas=horasEstimadas;
		this.compania=compania;
	}

	@Override
	public int compareTo(VideoArticulo otroVideojuego) {
		VideoJuego unVideoJuego = (VideoJuego) otroVideojuego;
		return this.horasEstimadas.compareTo(unVideoJuego.horasEstimadas);
	}

	@Override
	public String toString() {
		return "VideoJuego [horasEstimadas=" + horasEstimadas + ", compania=" + compania + ", getTitulo()="
				+ getTitulo() + ", getGenero()=" + getGenero() + "]";
	}

	public Integer getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(Integer horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}
	
	

}
