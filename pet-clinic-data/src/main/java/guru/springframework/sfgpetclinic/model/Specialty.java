package guru.springframework.sfgpetclinic.model;

/*
    Created by tylermckenney on 10/4/23.
*/

public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
