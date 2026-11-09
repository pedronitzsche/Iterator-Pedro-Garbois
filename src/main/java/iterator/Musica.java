package iterator;

public class Musica {

    private String titulo;
    private int duracaoSegundos;
    private boolean favorita;

    public Musica(String titulo, int duracaoSegundos, boolean favorita) {
        this.titulo = titulo;
        this.duracaoSegundos = duracaoSegundos;
        this.favorita = favorita;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public boolean isFavorita() {
        return favorita;
    }
}