
package ejercicio_actividad_4;


public class Cancion {
    

    private String artist;
    private String album;
    private int albumyear;
    private String title;
    private int reproductions;
    private boolean reproducedLast24Hours;
    private int likes;
    private int dislikes;
    private Estado estado;

    public void setReproducedLast24Hours(boolean bool) {
        reproducedLast24Hours = bool;
        updateState();
    }

    public Cancion(String artist, String album, int albumyear, String title) {
        this.artist = artist;
        this.album = album;
        this.albumyear = albumyear;
        this.title = title;
        this.reproductions = 0;
        this.reproducedLast24Hours = false;
        this.likes = 0;
        this.dislikes = 0;
        this.estado = new EstadoNormal(); // Estado inicial: Normal
    }

    public void play(int times) {
        // Lógica para aumentar las reproducciones
        this.reproductions += times;
        updateState();
    }

    public void like(int likes) {
        // Lógica para aumentar los likes
        this.likes += likes;
        updateState();
    }

    public void dislike(int cantidad) {
        // Lógica para aumentar los dislikes
        this.dislikes += cantidad;
        updateState();
    }

    public void updateState() {
        // Lógica para verificar y actualizar el estado de la canción
        if (estado instanceof EstadoNormal) {
            if (reproductions > 1000) {
                estado = new EstadoEnAuge();
            }
        }
        if (estado instanceof EstadoEnAuge) {
            if (reproductions > 50000 && likes > 20000) {
                estado = new EstadoTendencia();
            } else if (dislikes > 5000) {
                estado = new EstadoNormal();
            }
        }
        if (estado instanceof EstadoEnTendencia) {
            // Verificar si la canción no ha sido reproducida en las últimas 24 horas
            if (!reproducedLast24Hours) {
                estado = new EstadoNormal();
            }
        }
    }

    public String displaySongDetail() {
        return estado.displaySongDetail(this);
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String getTitle() {
        return title;
    }

    public int getAlbumyear() {
        return albumyear;
    }
}

