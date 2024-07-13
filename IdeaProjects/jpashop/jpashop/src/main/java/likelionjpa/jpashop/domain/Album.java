package likelionjpa.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@DiscriminatorValue("Album")
public class Album extends Item {
    private Long id;

    private String artist;
    private String etc;
}