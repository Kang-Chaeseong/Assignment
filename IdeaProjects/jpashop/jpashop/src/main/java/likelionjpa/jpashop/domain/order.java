package likelionjpa.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Entity
@Table(name = "orders")
@Getter @Setter

public class order {
    @Id
    @GeneratedValue
    @Column(name="order_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
    private List<OrderItem> orderItems = new ArrayList<>(); //List<OrderItem>이 무엇이지??
    private Delivery delivery; //Delivery 클래스를 하나 정의해야 함. 주석 최대한 많이 달아오고, 어노테이션 설명 등도 필요함.
    private LocalDateTime orderDate;
    private OrderStatus status;

    @OneToOne(mappedBy = "Delivery")
    private Delivery Delivery;
}
