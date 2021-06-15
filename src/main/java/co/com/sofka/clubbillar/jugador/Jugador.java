package co.com.sofka.clubbillar.jugador;

import co.com.sofka.clubbillar.jugador.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Set;

public class Jugador extends AggregateEvent<JugadorId> {
    protected Nombre nombre;
    protected Edad edad;
    protected Email email;
    protected Puntaje puntaje;
    protected Set<Membresia> membresia;

    public Jugador(JugadorId entityId, Nombre nombre, Edad edad, Email email, Puntaje puntaje) {
        super(entityId);
    }
}
