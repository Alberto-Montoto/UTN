
package ejercicio_actividad_4;

import static ejercicio_actividad_4.Icono.MUSICAL_NOTE;

public class EstadoNormal implements Estado{


    @Override
    public String displaySongDetail(Estado song) {
        return MUSICAL_NOTE.texto();// + song.getArtist() + " - " + song.getAlbum() + " - " + song.getTitle(); 
    }
}
