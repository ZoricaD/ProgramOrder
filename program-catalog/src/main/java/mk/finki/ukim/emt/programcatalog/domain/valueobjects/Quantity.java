package mk.finki.ukim.emt.programcatalog.domain.valueobjects;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import mk.finki.ukim.emt.sharedkernel.domain.base.ValueObject;

@Embeddable
@Getter
public class Quantity implements ValueObject {

    private final int quantity;

    protected Quantity(){
        this.quantity = 0;
    }
}
