package mk.finki.ukim.emt.programcatalog.domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import mk.finki.ukim.emt.programcatalog.domain.valueobjects.Quantity;
import mk.finki.ukim.emt.sharedkernel.domain.base.AbstractEntity;
import mk.finki.ukim.emt.sharedkernel.domain.financial.Money;

@Entity
@Table(name = "program")
public class Program extends AbstractEntity<ProgramId> {

   private String programName;

   private Money price;

    private Quantity quantity;

}
