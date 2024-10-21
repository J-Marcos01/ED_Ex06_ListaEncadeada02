package view;

import javax.swing.JOptionPane;
import br.edu.fateczl.set.Set;
import controller.PlayerController;
import model.Musica;

public class Principal {

	public static void main(String[] args) {
		Set<Musica> lista = new Set<>();
		PlayerController p = new PlayerController();
		int opc = 0;
		
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Vitufy\n1- Adicionar Música\n2- Remover Música\n3- Executar Playlist\n9- Fim"));
			switch(opc) {
			case 1:
				StringBuffer nMusica=new StringBuffer();
				String musica = JOptionPane.showInputDialog("Digite a música :");
				nMusica.append(musica);
				nMusica.append(";");
				String artista = JOptionPane.showInputDialog("Digite o artista :");
				nMusica.append(artista);
				nMusica.append(";");
				String duracao = JOptionPane.showInputDialog("Digite a duracao :");
				nMusica.append(duracao);
				nMusica.append(";");
				p.adicionaMusica(lista, nMusica.toString());
				break;
				
			case 2:
				int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da música na playlist para ser removida:"));
				p.removeMusica(lista, posicao);
				break;
				
			case 3:
				p.executaPlaylist(lista);
				break;
				
				
			case 9:
				JOptionPane.showMessageDialog(null, "Fim");
				System.exit(0);
				
				default:
					JOptionPane.showMessageDialog(null, "Opção Invalida");
					break;
					
			}			
			
		}
			
	}
	}


