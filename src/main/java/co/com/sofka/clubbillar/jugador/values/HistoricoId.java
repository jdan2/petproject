package co.com.sofka.clubbillar.jugador.values;

import co.com.sofka.domain.generic.Identity;

public class HistoricoId  extends Identity {

    public HistoricoId() {
    }

    private HistoricoId(String id){
        super(id);
    }

    public static HistoricoId of(String id){
        return new HistoricoId(id);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
}
