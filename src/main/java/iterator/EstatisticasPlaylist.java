package iterator;

import java.util.Iterator;

public class EstatisticasPlaylist {

    public static int contarFavoritas(Playlist playlist) {
        int quantidade = 0;

        for (Musica musica : playlist) {
            if (musica.isFavorita()) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static int calcularDuracaoTotal(Playlist playlist) {
        int duracaoTotal = 0;

        for (Iterator<Musica> iterator = playlist.iterator(); iterator.hasNext();) {
            Musica musica = iterator.next();
            duracaoTotal += musica.getDuracaoSegundos();
        }

        return duracaoTotal;
    }
}