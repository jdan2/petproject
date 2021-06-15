package co.com.sofka.clubbillar.jugador.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroPartidas implements ValueObject<Integer> {

    private final Integer value;

    public NumeroPartidas(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.equals(null)){
            throw new IllegalArgumentException("El numero de partidas no puede estar vacio");
        }

    }

    public Integer value() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumeroPartidas that = (NumeroPartidas) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
