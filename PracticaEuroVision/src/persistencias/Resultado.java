package persistencias;

public class Resultado {
	private String artista;
	private int votos;
	public Resultado(String artista, int votos) {
		super();
		this.artista = artista;
		this.votos = votos;
	}
	public Resultado() {
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public int getVotos() {
		return votos;
	}
	public void setVotos(int votos) {
		this.votos = votos;
	}
	
	
}
