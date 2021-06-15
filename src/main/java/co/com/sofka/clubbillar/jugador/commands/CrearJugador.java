package co.com.sofka.clubbillar.jugador.commands;

import co.com.sofka.clubbillar.jugador.values.*;
import co.com.sofka.domain.generic.Command;

public class CrearJugador implements Command {
    private final JugadorId entityId;
    private final Nombre nombre;
    private final Edad edad;
    private final Email email;
    private final Puntaje puntaje;

    public CrearJugador(JugadorId entityId, Nombre nombre, Edad edad, Email email, Puntaje puntaje) {
        this.entityId = entityId;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.puntaje = puntaje;
    }

    public JugadorId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Edad getEdad() {
        return edad;
    }

    public Email getEmail() {
        return email;
    }

    public Puntaje getPuntaje() {
        return puntaje;
    }
}
