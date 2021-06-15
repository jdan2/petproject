package co.com.sofka.clubbillar.partida;

import co.com.sofka.clubbillar.partida.values.Email;
import co.com.sofka.clubbillar.partida.values.Especialidad;
import co.com.sofka.clubbillar.partida.values.JuezId;
import co.com.sofka.clubbillar.partida.values.Salario;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Juez extends Entity<JuezId> {

    private Especialidad especialidad;
    private Email email;
    private Salario salario;

    public Juez(JuezId entityId, Especialidad especialidad, Email email, Salario salario) {
        super(entityId);
        this.especialidad = especialidad;
        this.email = email;
        this.salario = salario;
    }

    public void actualizarJuez(Juez juez){
       this.especialidad = Objects.requireNonNull(juez.especialidad);
       this.email = Objects.requireNonNull(juez.email);
       this.salario = Objects.requireNonNull(juez.salario);

    }

    public Especialidad especialidad() {
        return especialidad;
    }

    public Email email() {
        return email;
    }

    public Salario salario() {
        return salario;
    }
}
