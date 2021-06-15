package co.com.sofka.clubbillar.jugador.values;

import co.com.sofka.domain.generic.Identity;

public class PuntajeId extends Identity {

    public PuntajeId() {
    }

    private PuntajeId(String id){
        super(id);
    }

    public static PuntajeId of(String id){
        return new PuntajeId(id);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
}
