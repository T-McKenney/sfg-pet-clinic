package guru.springframework.sfgpetclinic.model;

/*
    Created by tylermckenney on 10/4/23.
*/

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "specialty")
public class Specialty extends BaseEntity {

    @Column(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
