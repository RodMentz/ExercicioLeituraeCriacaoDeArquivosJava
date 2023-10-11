import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Locadora {
	Item[] itens = new Item[20];
	private int last = -1;
	public Locadora(String nomeArquivo) {
		inicilalizaItems();
	}
	
	public Item[] getItens() {
		return itens;
	}

	public void setItens(Item[] itens) {
		this.itens = itens;
	}

	public int getLast() {
		return last;
	}

	public void setLast(int last) {
		this.last = last;
	}

	private void inicilalizaItems() {
		try {
            FileReader fr = new FileReader("itens.txt");
            BufferedReader br = new BufferedReader(fr);
                  
            
            String linha = br.readLine();
            while (linha != null) {
                String[] itemInfo = linha.split("\\|");
                int id = Integer.parseInt(itemInfo[0].trim());
                String tipo = itemInfo[1].trim();
                String nome = itemInfo[2].trim();
                double preco = Double.parseDouble(itemInfo[3].trim());
                String artista = itemInfo[4].trim();
                int ano = Integer.parseInt(itemInfo[5].trim());

                if (tipo.equalsIgnoreCase("CD")) {
                	 CD cd = new CD(id, tipo, nome, preco, artista, ano);
                   adicionaProduto(cd);
                } else if (tipo.equalsIgnoreCase("DVD")) {
                	DVD dvd = new DVD(id, tipo, nome, preco, artista, ano);
                	adicionaProduto(dvd);
                }
                
                linha = br.readLine();
            }
            
            br.close();
            fr.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao ler o arquivo notas.txt: " + e.getMessage());
        } catch(IOException ie) {
        	ie.getMessage();
        }
		
	}
	
	public void adicionaProduto(Item a) {
		try {
	        if (this.last >= 99) {
	        	throw new ImpossibleToAddItemException("Espaço insuficiente");
	    		
	        }
	        for (int i = 0; i <= this.last; i++) {
	            if (a.getIdentificador() == itens[i].getIdentificador()) {
	            	throw new ImpossibleToAddItemException("Já existe um item com o mesmo identificador!");
	            }
	        }
	        this.last++;
	        itens[this.last] = a;
		} catch(ImpossibleToAddItemException e) {
			System.out.println(e.toString());
		}
    }
	
	public void removeItem(int identificador){
		try {
        boolean encontrado = false;
        for (int i = 0; i <= this.last; i++) {
            if (itens[i].getIdentificador() == identificador) {
                encontrado = true;
                for (int j = i; j < this.last; j++) {
                    itens[j] = itens[j + 1];
                }
                itens[this.last] = null;
                this.last--;
                break;
            }
        }
        if (!encontrado) {
            throw new ImpossibleToRemoveItemException("Não existe um item com o identificador informado!");
        }
		} catch(ImpossibleToRemoveItemException e) {
			System.out.println(e.toString());
		}
    }

	@Override
	public String toString() {
		return "Locadora [itens=" + Arrays.toString(itens) + ", last=" + last + "]";
	}
	
	
	

		
}
