package guru.springframework.sfgpetclinic.model;

/*
    Created by tylermckenney on 10/4/23.
*/

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "specialty")
public class Specialty extends BaseEntity {

    @Column(name = "description")
    private String description;
}
