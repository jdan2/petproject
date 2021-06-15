package co.com.sofka.clubbillar.partida.events;

import co.com.sofka.clubbillar.partida.values.Puntaje;
import co.com.sofka.clubbillar.partida.values.Tiempo;
import co.com.sofka.domain.generic.DomainEvent;

public class PartidaCreada extends DomainEvent {

    private Puntaje puntaje;
    private Tiempo tiempo;

    public PartidaCreada(Puntaje puntaje, Tiempo tiempo) {
        super("sofka.partida.partidacreada");
        this.puntaje = puntaje;
        this.tiempo = tiempo;
    }

    public Puntaje getPuntaje() {
        return puntaje;
    }

    public Tiempo getTiempo() {
        return tiempo;
    }
}
