package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Visit extends BaseEntity  {

    private LocalDate localDate;
    private String string;
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
