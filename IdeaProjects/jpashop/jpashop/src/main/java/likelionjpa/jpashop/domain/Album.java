package likelionjpa.jpashop.domain;

import jakarta.persistence.*;
import likelionjpa.jpashop.domain.Category;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Album extends item {
    private Long id;

    private String artist;
    private String etc;
}