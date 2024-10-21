package controller;

import br.edu.fateczl.set.Set;
import model.Musica;

public class PlayerController {

	public PlayerController() {
		super();
	}

	public void adicionaMusica(Set<Musica> lista,String musica) {
		Musica m = new Musica();
		String[] aux=musica.split(";");
		
		try {
			m.setNome(aux[0]);
			m.setArtista(aux[1]);
			m.setDuracao(Integer.parseInt(aux[2]));
			lista.addLast(m);
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
			
	}
	
	public void removeMusica(Set<Musica>lista,int posicao) {
		
		try {
			lista.remove(posicao);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	public void executaPlaylist(Set<Musica> lista) {
		if(lista.isEmpty()) {
			System.out.println("Playlist Vazia");
		} else {
		
		for(int i = 0; i < lista.size(); i++) {
			try {
				Musica m = lista.get(i);
				System.out.println("Música: " + m.getNome() + " - Artista: " + m.getArtista() +
						" Duração: " + m.getDuracao());
				
				Thread.sleep(m.getDuracao() + 10000);
				
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}

		
	}
				
}
