package dao;

import entity.Compositor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CompositorRepository extends JpaRepository<Compositor, Long> {
}
