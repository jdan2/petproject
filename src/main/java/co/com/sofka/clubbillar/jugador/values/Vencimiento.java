package co.com.sofka.clubbillar.jugador.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Vencimiento implements ValueObject<String> {

    private final String value;

    public Vencimiento(String value) {
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
}
