package dao;

import entity.Band;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BandRepository extends JpaRepository<Band, Long> {
}
