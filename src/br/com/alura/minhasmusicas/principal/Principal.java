package br.com.alura.minhasmusicas.principal;
import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setArtista("Dua Lipa");
        minhaMusica.setTitulo("No Lie");

        for (int i = 0; i < 1500; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 500; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setApresentador("Luiz Francisco");
        meuPodcast.setTitulo("Tragédia no Rio Grande do Sul");

        for (int i = 0; i < 10000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 4500; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(minhaMusica);
        preferidas.inclui(meuPodcast);
    }
}
