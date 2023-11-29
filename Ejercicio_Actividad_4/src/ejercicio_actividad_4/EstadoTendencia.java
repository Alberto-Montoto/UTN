
package ejercicio_actividad_4;

import static ejercicio_actividad_4.Icono.FIRE;


public class EstadoTendencia implements Estado{

    @Override
    public String displaySongDetail(Estado song) {
        return  FIRE.texto();// + song.getTitle() + " - " + song.getArtist() + " (" + song.getAlbum() + " - " + song.getAlbumyear() + ")";
    }
}
