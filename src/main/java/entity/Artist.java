package entity;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "artist")
public class Artist extends Musician {

    private String firstName;
    private String lastName;
    private Set<Band> bands;

    public Artist() {
    }

    public Artist(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Column(name = "FIRST_NAME")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @ManyToMany(mappedBy = "bands")
    public Set<Band> getBands() {
        return bands;
    }

    public void setBands(Set<Band> bands) {
        this.bands = bands;
    }

    @Override
    public String toString() {
        return "Artist{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", songs=" + super.getSongs() +
                '}';
    }
}
