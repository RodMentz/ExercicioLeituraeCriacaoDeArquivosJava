
public class ImpossibleToRemoveItemException extends Exception{
	private String mensagem;
	public ImpossibleToRemoveItemException(String mensagem) {
		this.mensagem = mensagem;
	}
	public String toString() {
		return " ImpossibleToAddItemException [" + mensagem + "]";
	}
}
