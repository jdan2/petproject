package co.com.sofka.clubbillar.jugador.events;

import co.com.sofka.clubbillar.jugador.values.HistoricoId;
import co.com.sofka.clubbillar.jugador.values.NumeroPartidas;
import co.com.sofka.clubbillar.jugador.values.Racha;
import co.com.sofka.domain.generic.DomainEvent;

public class HistoricoAgregado extends DomainEvent {
    private final HistoricoId his;
    private final Racha racha;
    private final NumeroPartidas numeroPartidas;

    public HistoricoAgregado(HistoricoId his, Racha racha, NumeroPartidas numeroPartidas) {
        super("sofka.jugador.historicoagreagdo");
        this.his = his;
        this.racha = racha;
        this.numeroPartidas = numeroPartidas;
    }

    public HistoricoId getHis() {
        return his;
    }

    public Racha getRacha() {
        return racha;
    }

    public NumeroPartidas getNumeroPartidas() {
        return numeroPartidas;
    }
}
