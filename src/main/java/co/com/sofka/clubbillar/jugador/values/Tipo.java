package co.com.sofka.clubbillar.jugador.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Tipo implements ValueObject<String> {
    private final String value;

    public Tipo(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El nombre de tipo no puede estar vacio");
        }

        if (this.value.length() <= 5){
            throw new IllegalArgumentException("El nombre  de tipo debe ser mayor a 5 caracteres");
        }

        if (this.value.length() >= 30){
            throw new IllegalArgumentException("El nombre  de tipo debe ser menor a 30 caracteres");
        }

    }



    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tipo tipo = (Tipo) o;
        return Objects.equals(value, tipo.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
