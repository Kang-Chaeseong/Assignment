package likelionjpa.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.query.Order;

@Entity
@Table(name = "Delivery")
@Getter @Setter

public class Delivery {
    @Id
    @GeneratedValue
    @Column(name = "Delivery_id")
    private Long id;

    @Embedded
    private Address address;
    private OrderStatus status;

    @OneToOne(mappedBy = "order")
    private order order;
}
