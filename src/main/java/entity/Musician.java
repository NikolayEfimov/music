package entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "musician")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Musician {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    private Set<Song> songs;

    @ManyToMany
    @JoinTable(name = "musician_song", joinColumns = {@JoinColumn(name = "musicianId", referencedColumnName = "id")}, inverseJoinColumns = {@JoinColumn(name = "songId", referencedColumnName = "id")})
    public Set<Song> getSongs() {
        return songs;
    }

    public void setSongs(Set<Song> songs) {
        this.songs = songs;
    }


}
