
public class ImpossibleToAddItemException extends Exception{
	private String mensagem;
	public ImpossibleToAddItemException(String mensagem) {
		this.mensagem = mensagem;
	}
	public String toString() {
		return "ImpossibleToAddItemException [" + mensagem + "]";
	}
}

