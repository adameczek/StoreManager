package pl.sawickiadam.storemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sawickiadam.storemanager.model.Roll;

public interface RollRepository extends JpaRepository <Roll, Long> {
}
