package co.com.sofka.clubbillar.jugador.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Edad implements ValueObject<String> {

    private final String value;

    public Edad(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }

        if (this.value.length() <= 18){
            throw new IllegalArgumentException("El nombre debe ser mayor a 5 caracteres");
        }

    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edad edad = (Edad) o;
        return Objects.equals(value, edad.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
