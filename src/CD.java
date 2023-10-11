
public class CD extends Item{
	private String artista;
	private int quantMusicas;
	private String tipo;
	
	
	
	public CD(int identificador, String tipo, String nome, double preco, String artista, int quantMusicas) {
		super(identificador, nome, preco);
		this.artista = artista;
		this.quantMusicas = quantMusicas;
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public int getQuantMusicas() {
		return quantMusicas;
	}
	public void setQuantMusicas(int quantMusicas) {
		this.quantMusicas = quantMusicas;
	}

	@Override
	public String toString() {
		return "CD | " + super.getIdentificador() + " | " + getTipo() +  " | " + getNome() +  " | " + super.getPreco() + " | " +  " | "  + getArtista() + " | " + getQuantMusicas();
	}
	
	
	
}
