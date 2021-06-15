package co.com.sofka.clubbillar.partida;

import co.com.sofka.clubbillar.partida.events.PartidaCreada;
import co.com.sofka.clubbillar.partida.values.PartidaId;
import co.com.sofka.clubbillar.partida.values.Puntaje;
import co.com.sofka.clubbillar.partida.values.Tiempo;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Set;

public class Partida extends AggregateEvent<PartidaId> {

    private Puntaje puntaje;
    private Tiempo tiempo;
    private Set<Resultado> resultado;
    private Set<Juez> juez;

    public Partida(PartidaId entityId, Puntaje puntaje, Tiempo tiempo) {
        super(entityId);
        appendChange(new PartidaCreada(puntaje, tiempo)).apply();
    }
}
