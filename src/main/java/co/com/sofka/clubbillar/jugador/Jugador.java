package co.com.sofka.clubbillar.jugador;

import co.com.sofka.clubbillar.jugador.events.JugadorCreado;
import co.com.sofka.clubbillar.jugador.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Jugador extends AggregateEvent<JugadorId> {
    protected Nombre nombre;
    protected Edad edad;
    protected Email email;
    protected Puntaje puntaje;
    protected Set<Membresia> membresia;
    protected List<Historico> historico;

    public Jugador(JugadorId entityId, Nombre nombre, Edad edad, Email email, Puntaje puntaje) {
        super(entityId);
        appendChange(new JugadorCreado(nombre, edad, email, puntaje)).apply();
    }

    public void actualizarJugador(Jugador jugador){
        appendChange(new JugadorActualizado(nombre, edad, email, puntaje)).apply();
    }

    public void  agregarHistorico(HistoricoId entityId, Racha racha, NumeroPartidas numeroPartidas){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(racha);
        Objects.requireNonNull(numeroPartidas);
        appendChange(new HistoricoAgregado( entityId, racha, numeroPartidas));
    }

    public void asignarMembresia(MembresiaId membresiaId){
        appendChange(new MembresiaAsignada(membresiaId)).apply();

    }

    public Optional<Membresia> getMembresiaPorId(MembresiaId membresiaId){
        return membresia()
                .stream()
                .filter(membresia -> membresia.identity().equals(entityId))
                .findFirst();
    }

    public Nombre nombre() {
        return nombre;
    }

    public Edad edad() {
        return edad;
    }

    public Email email() {
        return email;
    }

    public Puntaje puntaje() {
        return puntaje;
    }

    public Set<Membresia> membresia() {
        return membresia;
    }

    public List<Historico> historico() {
        return historico;
    }
}
