package likelionjpa.jpashop.domain;

import jakarta.persistence.*;
//import jdk.jfr.Category;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter @Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public abstract class Item {
    @Id
    @GeneratedValue
    @Column(name = "item")
    private Long id;
    private String name;
    private int price;
    private int stockQuantity;

    @OneToMany(mappedBy = "item")
    private List<OrderItem> orderItems = new ArrayList<>();

    @OneToOne
    @JoinColumn(name="order_id")
    private Order order;

    @ManyToMany(mappedBy = "items")
    private List<Category> categories = new ArrayList<>();
}

