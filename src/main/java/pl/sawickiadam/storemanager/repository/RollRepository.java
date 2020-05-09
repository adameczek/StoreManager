package pl.sawickiadam.storemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sawickiadam.storemanager.model.Roll;

import java.util.List;
public interface RollRepository extends JpaRepository <Roll, Long> {
    List<Roll> findAllByName(String name);
    Roll findByNameAndAndColorNumber(String name, int colorNumber);
}
