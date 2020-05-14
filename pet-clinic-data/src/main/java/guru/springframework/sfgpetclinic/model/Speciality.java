package guru.springframework.sfgpetclinic.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "specialty")
public class Speciality extends BaseEntity {

    // nie ma tutaj odzwierceidlnia @ManyToMany
    // gdzie jest zdefiniowane specialty_id ??


    @Column(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
