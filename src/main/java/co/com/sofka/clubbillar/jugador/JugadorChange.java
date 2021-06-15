package co.com.sofka.clubbillar.jugador;

import co.com.sofka.clubbillar.jugador.events.HistoricoAgregado;
import co.com.sofka.clubbillar.jugador.events.JugadorCreado;
import co.com.sofka.clubbillar.jugador.events.MembresiaAsignada;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class JugadorChange extends EventChange {

    public JugadorChange(Jugador jugador) {

        apply((JugadorCreado event) ->{
            jugador.nombre = event.getNombre();
            jugador.edad = event.getEdad();
            jugador.email = event.getEmail();
            jugador.puntaje = event.getPuntaje();
        });

        apply((MembresiaAsignada event) ->{
           jugador.membresiaId = event.getMembresiaId();
        });

        apply((HistoricoAgregado event)-> {
            jugador.historico.add(new Historico(
                    event.getHis(),
                    event.getRacha(),
                    event.getNumeroPartidas()
            ));

        });

    }


}
