package likelionjpa.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
@Table(name = "OrderItem")

public class OrderItem {
    @Id
    @GeneratedValue
    @Column(name="order_item_id")

    private Long id;


    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="item_id")
    private Item item; //Item 클래스 빌드되면 빨간 글씨 사라질지도??


    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="order_id")
    private Order order;
    private int orderprice;
    private int count;
}
