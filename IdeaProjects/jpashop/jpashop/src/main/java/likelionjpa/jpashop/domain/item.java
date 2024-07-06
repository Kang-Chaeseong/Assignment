package likelionjpa.jpashop.domain;

import jakarta.persistence.*;
import jdk.jfr.Category;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter @Entity

public abstract class item {
    @Id
    @GeneratedValue
    @Column(name = "item")
    private Long id;
    private String name;
    private int price;
    private int stockQuantity;
    private List<Category> Categories = new ArrayList<>();
}

