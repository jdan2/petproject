package co.com.sofka.clubbillar.jugador;

import co.com.sofka.clubbillar.jugador.values.HistoricoId;
import co.com.sofka.clubbillar.jugador.values.NumeroPartidas;
import co.com.sofka.clubbillar.jugador.values.Racha;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Historico extends Entity<HistoricoId> {

    private Racha racha;
    private NumeroPartidas numeroPartidas;

    public Historico(HistoricoId entityId, Racha racha, NumeroPartidas numeroPartidas) {
        super(entityId);
        this.racha = racha;
        this.numeroPartidas = numeroPartidas;
    }

    public void actualizarHistorico(Historico historico){
        this.racha = Objects.requireNonNull(historico.racha());
        this.numeroPartidas = Objects.requireNonNull(historico.numeroPartidas());
    }

    public Racha racha() {
        return racha;
    }

    public NumeroPartidas numeroPartidas() {
        return numeroPartidas;
    }
}
