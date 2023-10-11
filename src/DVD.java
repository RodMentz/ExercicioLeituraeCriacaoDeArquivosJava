
public class DVD extends Item{
	private String descricao;
	private int anoLancamento;
	private String tipo;

	
	
	public DVD(int identificador, String tipo, String nome, double preco, String descricao, int anoLancamento) {
		super(identificador, nome, preco);
		this.tipo = tipo;
		this.descricao = descricao;
		this.anoLancamento = anoLancamento;
	}
	
	
	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}


	@Override
	public String toString() {
		return "DVD | " + super.getIdentificador() + " | " + getTipo() +  " | " + getDescricao() +  " | " + super.getPreco() + " | " + super.getNome() +  " | "  + getAnoLancamento();
	}

	
	
	
}
