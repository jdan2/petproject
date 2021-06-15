package co.com.sofka.clubbillar.jugador.events;

import co.com.sofka.clubbillar.jugador.values.Edad;
import co.com.sofka.clubbillar.jugador.values.Email;
import co.com.sofka.clubbillar.jugador.values.Nombre;
import co.com.sofka.clubbillar.jugador.values.Puntaje;
import co.com.sofka.domain.generic.DomainEvent;

public class JugadorCreado extends DomainEvent {

    private final Nombre nombre;
    private final Edad edad;
    private final Email email;
    private final Puntaje puntaje;


    public JugadorCreado(Nombre nombre, Edad edad, Email email, Puntaje puntaje) {
        super("sofka.jugador.jugadorcreado");
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.puntaje = puntaje;
    }

    public Email getEmail() {
        return email;
    }

    public Puntaje getPuntaje() {
        return puntaje;
    }

    public Edad getEdad() {
        return edad;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
