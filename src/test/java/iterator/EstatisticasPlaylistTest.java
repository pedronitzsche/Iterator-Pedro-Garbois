package iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EstatisticasPlaylistTest {

    @Test
    void deveContarMusicasFavoritas() {
        Playlist playlist = new Playlist(
                new Musica("Musica A", 180, true),
                new Musica("Musica B", 240, false),
                new Musica("Musica C", 200, true),
                new Musica("Musica D", 160, true)
        );

        assertEquals(3, EstatisticasPlaylist.contarFavoritas(playlist));
    }

    @Test
    void deveCalcularDuracaoTotal() {
        Playlist playlist = new Playlist(
                new Musica("Musica A", 180, true),
                new Musica("Musica B", 240, false),
                new Musica("Musica C", 200, true),
                new Musica("Musica D", 160, true)
        );

        assertEquals(780, EstatisticasPlaylist.calcularDuracaoTotal(playlist));
    }
}