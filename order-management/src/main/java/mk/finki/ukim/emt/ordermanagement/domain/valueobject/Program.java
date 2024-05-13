package mk.finki.ukim.emt.ordermanagement.domain.valueobject;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import mk.finki.ukim.emt.sharedkernel.domain.base.ValueObject;
import mk.finki.ukim.emt.sharedkernel.domain.financial.Currency;
import mk.finki.ukim.emt.sharedkernel.domain.financial.Money;

@Getter
public class Program implements ValueObject {

    private final ProgramId id;
    private final String name;
    private final Money price;
    private final int sales;



    @JsonCreator
    public Program(@JsonProperty("id") ProgramId id,
                   @JsonProperty("productName") String name,
                   @JsonProperty("price") Money price,
                   @JsonProperty("sales") int sales) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.sales = sales;
    }
}

