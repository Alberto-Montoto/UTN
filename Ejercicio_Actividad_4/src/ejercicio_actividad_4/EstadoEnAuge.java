
package ejercicio_actividad_4;

import static ejercicio_actividad_4.Icono.ROCKET;



public class EstadoEnAuge implements Estado{
    

    @Override
    public String displaySongDetail(Estado song) {
        return ROCKET.texto();// + song.getArtist() + " - " + song.getTitle() + " (" + song.getAlbum() + " - " + song.getAlbumyear() + ")";
    }

}
