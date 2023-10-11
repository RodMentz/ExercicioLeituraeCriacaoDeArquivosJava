import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

//Trabalho feito por: Rodrigo Korte Mentz, RA: 1926088 e Thurryan Markus Silva RA: 1928680

public class Principal {

	public static void main(String[] args) {
		
		CD auxCD = new CD(0, "", "", 0, "", 0);
		DVD auxDVD = new DVD(0, "", "", 0, "", 0);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Locadora locadora = null;
        String nomeArquivo;
        boolean arquivoValido = false;

        while (!arquivoValido) {
            try {
                System.out.print("Digite o nome do arquivo de itens da locadora: ");
                nomeArquivo = reader.readLine();
                locadora = new Locadora(nomeArquivo);
                arquivoValido = true;
            } catch (FileNotFoundException e) {
                System.out.println("Arquivo não encontrado. Tente novamente.");
            } catch (IOException e) {
                System.out.println("Erro de entrada/saída. Tente novamente.");
            }
        }
        
        // Imprime informações de todos os produtos da locadora
       	for(int i=0; i<20; i++) {
    		System.out.println(locadora.getItens()[i]+" ");
    		System.out.println();
    		}	
    	       
       	
        // Cria arquivo com nome e preço de todos os itens, ordenados pelo preço
        try (PrintWriter writer = new PrintWriter("itensOrdenados.txt")) {
            Item[] itens = locadora.getItens();
            
            for(int i = 0; i < 19; i++) {
            	for(int j = 0; j < 19; j++) {
            		if(locadora.itens[j].getPreco() > locadora.itens[j + 1].getPreco()) {
            			boolean aux = true;
            			if (locadora.itens[j] instanceof CD) {
                       	 auxCD = (CD) locadora.itens[j];
                       	 aux = false;
                       } else if (locadora.itens[j] instanceof DVD) {
                    	 auxDVD = (DVD) locadora.itens[j];
                       }

            			locadora.itens[j] = locadora.itens[j + 1];
            			if(aux) {
            				locadora.itens[j + 1] = auxDVD;
            			}
            			if(!aux) {
            				locadora.itens[j + 1] = auxCD;
            			}
            		}
            	}
            }
            
            for (Item item : itens) {
                writer.println(item.getNome() + " - R$" + item.getPreco());
            }
            System.out.println("Arquivo itensOrdenados.txt criado com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo itensOrdenados.txt.");
        }
       	
        
        
        // Cria arquivo com informações dos DVDs da locadora
        try (PrintWriter writer = new PrintWriter("dvds.txt")) {
            for (Item item : locadora.getItens()) {
                if (item instanceof DVD) {
                    writer.println(item.toString());
                }
            }
            System.out.println("Arquivo dvds.txt criado com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo dvds.txt.");
        }
    }
        
}
