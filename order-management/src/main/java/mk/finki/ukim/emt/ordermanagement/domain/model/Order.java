package mk.finki.ukim.emt.ordermanagement.domain.model;

import jakarta.persistence.*;
import mk.finki.ukim.emt.sharedkernel.domain.base.AbstractEntity;
import mk.finki.ukim.emt.sharedkernel.domain.financial.Currency;
import mk.finki.ukim.emt.sharedkernel.domain.financial.Money;

import java.time.Instant;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order extends AbstractEntity<OrderId> {

    private Instant orderedOn;

   

    private Money total;
    @Column(name="order_currency")
    @Enumerated(EnumType.STRING)
    private Currency currency;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<OrderItem> orderItemList;

    public Order(){

    }




    public Money total() {
        return orderItemList.stream().map(OrderItem::subtotal).reduce(new Money(currency, 0), Money::add);
    }

}
