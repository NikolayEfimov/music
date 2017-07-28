import dao.ArtistRepository;
import dao.BandRepository;
import entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(basePackages = {"service", "dao"})
@Configuration
public class Application implements CommandLineRunner {


    @Autowired
    private BandRepository bandRepository;

    @Autowired
    private ArtistRepository artistRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Override
    public void run(String... strings) throws Exception {
        prepareDatabase();
    }

    private void prepareDatabase() {

        List<Artist>
        Artist bobMarley = new Artist("Bob", "Marley");
        Artist marlinManson = new Artist("Marlin", "Manson");
        Artist paulMcCartny = new Artist("Paul", "Mccartny");
        Artist johnLennon = new Artist("John", "Lennon");
        Artist ringoStar = new Artist("Ringo", "Star");
        Artist mickaelJacson = new Artist("Mickael", "Jacson");
        Artist kurtKobein = new Artist("Kurt", "Kobein");
        Artist brianIno = new Artist("Brian", "Ino");
        Artist georgeMickael = new Artist("George", "Mickael");
        Artist tillLindemann = new Artist("Till", "Lindemann");






        Song song = new Song();
        song.setAuthor(new Author());
        song.setCompositor(new Compositor());
        song.setName("Redemption Song");

        Song song2 = new Song();
        song2.setAuthor(new Author());
        song2.setCompositor(new Compositor());
        song2.setName("Buffalo Soldier");

        Set<Song> marleySongs = new HashSet<>();
        marleySongs.add(song);
        marleySongs.add(song2);
        artist1.setSongs(marleySongs);


        Band band1 = new Band();
        band1.setName("Led Zeppelin");
        band1.setStartDate(new Date(LocalDate.of(1968, 1, 1).toEpochDay() * 1000));
        band1.setEndDate(new Date(LocalDate.of(1980, 1, 1).toEpochDay() * 1000));


        Artist jimmyPage = new Artist();
        jimmyPage.setFirstName("Jimmy");
        jimmyPage.setLastName("Page");

        Artist robertPlant = new Artist();
        jimmyPage.setFirstName("Robert");
        jimmyPage.setLastName("Plant");

        Artist johnPaulJones = new Artist();
        jimmyPage.setFirstName("John Paul");
        jimmyPage.setLastName("Jones");

        Artist johnBonham = new Artist();
        jimmyPage.setFirstName("John");
        jimmyPage.setLastName("Bonham");

        Set<Artist> zeppelinCrew = new HashSet<>();
        zeppelinCrew.add(jimmyPage);
        zeppelinCrew.add(robertPlant);
        zeppelinCrew.add(johnPaulJones);
        zeppelinCrew.add(johnBonham);

        band1.setArtists(zeppelinCrew);


        //artistRepository.save(artist1);
        bandRepository.save(band1);

    }
}
