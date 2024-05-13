package mk.finki.ukim.emt.ordermanagement.domain.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import mk.finki.ukim.emt.ordermanagement.domain.valueobject.ProgramId;
import mk.finki.ukim.emt.sharedkernel.domain.base.AbstractEntity;
import mk.finki.ukim.emt.sharedkernel.domain.financial.Money;

@Entity
@Table(name = "order_item")
public class OrderItem extends AbstractEntity<OrderItemId> {


    private Money itemPrice;


    @Column(name = "qty", nullable = false)
    private int quantity;

    @AttributeOverride(name = "id", column = @Column(name = "program_id",
            nullable = false))
    private ProgramId programId;

    public Money subtotal() {
        return itemPrice.multiply(quantity);
    }

}
