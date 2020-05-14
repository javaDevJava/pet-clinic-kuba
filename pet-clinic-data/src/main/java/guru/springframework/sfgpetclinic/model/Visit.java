package guru.springframework.sfgpetclinic.model;

import javax.persistence.*;
import java.time.LocalDate;



@Entity
@Table(name = "visit")
public class Visit extends BaseEntity  {

    @Column(name = "local_date")
    private LocalDate localDate;

    @Column(name = "string")
    private String string;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;


    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
