package co.com.sofka.clubbillar.jugador.commands;

import co.com.sofka.clubbillar.jugador.values.MembresiaId;
import co.com.sofka.domain.generic.Command;

public class AsignarMembresia implements Command {

    private final MembresiaId membresiaId;

    public AsignarMembresia(MembresiaId membresiaId) {
        this.membresiaId = membresiaId;
    }

    public MembresiaId getMembresiaId() {
        return membresiaId;
    }
}
