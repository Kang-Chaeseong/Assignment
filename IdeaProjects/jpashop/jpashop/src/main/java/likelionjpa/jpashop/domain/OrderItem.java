package likelionjpa.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.query.Order;

@Entity @Getter @Setter
@Table(name = "OrderItem")

public class OrderItem {
    @Id
    @GeneratedValue
    @Column(name="order_item_id")

    private Long id;
    private item item; //Item 클래스 빌드되면 빨간 글씨 사라질지도??
    @ManyToOne
    @JoinColumn(name="order_id")
    private order order;
    private int orderprice;
    private int count;
}
