package likelionjpa.jpashop.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Entity
public class Category {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
