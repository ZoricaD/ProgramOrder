package mk.finki.ukim.emt.sharedkernel.domain.base;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEntity<ID extends DomainObjectId> {

    @EmbeddedId
    private ID id;

}
