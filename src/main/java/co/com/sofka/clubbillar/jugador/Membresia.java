package co.com.sofka.clubbillar.jugador;

import co.com.sofka.clubbillar.jugador.values.MembresiaId;
import co.com.sofka.clubbillar.jugador.values.Tipo;
import co.com.sofka.clubbillar.jugador.values.Vencimiento;
import co.com.sofka.clubbillar.mesa.values.Precio;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Membresia extends Entity<MembresiaId> {

    private  Tipo tipo;
    private  Vencimiento vencimiento;
    private  Precio precio;

    public Membresia(MembresiaId entityId, Tipo tipo, Vencimiento vencimiento, Precio precio) {
        super(entityId);
        this.tipo = tipo;
        this.vencimiento = vencimiento;
        this.precio = precio;
    }

    public void actualizarMembresia(Membresia membresia){
        this.tipo = Objects.requireNonNull(membresia.tipo());
        this.vencimiento = Objects.requireNonNull(membresia.vencimiento());
        this.precio = Objects.requireNonNull(membresia.precio());
    }

    public Tipo tipo() {
        return tipo;
    }

    public Vencimiento vencimiento() {
        return vencimiento;
    }

    public Precio precio() {
        return precio;
    }
}
