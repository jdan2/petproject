package co.com.sofka.clubbillar.jugador.events;

import co.com.sofka.clubbillar.jugador.values.MembresiaId;
import co.com.sofka.domain.generic.DomainEvent;

public class MembresiaAsignada extends DomainEvent {

    private final MembresiaId membresiaId;

    public MembresiaAsignada(MembresiaId membresiaId) {
        super("sofka.jugador.membresiaasignada");
        this.membresiaId = membresiaId;
    }

    public MembresiaId getMembresiaId() {
        return membresiaId;
    }
}
