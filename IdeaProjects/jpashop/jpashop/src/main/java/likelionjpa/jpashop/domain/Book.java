package likelionjpa.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Book extends Item {
    private Long id;

    private String author;
    private int isbn;
}