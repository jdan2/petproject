package co.com.sofka.clubbillar.jugador.commands;


import co.com.sofka.clubbillar.jugador.values.HistoricoId;
import co.com.sofka.clubbillar.jugador.values.NumeroPartidas;
import co.com.sofka.clubbillar.jugador.values.Racha;
import co.com.sofka.domain.generic.Command;

public class AgregarHistorico implements Command {

    private final HistoricoId entityId;
    private final Racha racha;
    private final NumeroPartidas numeroPartidas;

    public AgregarHistorico(HistoricoId entityId, Racha racha, NumeroPartidas numeroPartidas) {
        this.entityId = entityId;
        this.racha = racha;
        this.numeroPartidas = numeroPartidas;
    }

    public HistoricoId getEntityId() {
        return entityId;
    }

    public Racha getRacha() {
        return racha;
    }

    public NumeroPartidas getNumeroPartidas() {
        return numeroPartidas;
    }
}
