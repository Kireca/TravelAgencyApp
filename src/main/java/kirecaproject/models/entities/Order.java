package kirecaproject.models.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Order extends BaseEntity {


    private LocalDateTime startDate;

    private LocalDateTime endDate;

    @ManyToOne(targetEntity = User.class)
    private User user;

    @OneToMany
    List<Product> products;

    public Order() {
        setStartDate(LocalDateTime.now());
    }


}