package co.com.sofka.clubbillar.mesa;

import co.com.sofka.clubbillar.mesa.values.MesaId;
import co.com.sofka.domain.generic.AggregateEvent;

public class Mesa extends AggregateEvent<MesaId> {
    public Mesa(MesaId entityId) {
        super(entityId);
    }
}
