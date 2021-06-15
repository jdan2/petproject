package co.com.sofka.clubbillar.jugador.values;

import co.com.sofka.domain.generic.Identity;

public class JugadorId extends Identity {

    public JugadorId() {
    }

    private JugadorId(String id){
        super(id);
    }

    public static JugadorId of(String id){
        return new JugadorId(id);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
}
