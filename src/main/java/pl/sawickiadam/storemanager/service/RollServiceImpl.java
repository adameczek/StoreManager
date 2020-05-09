package pl.sawickiadam.storemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sawickiadam.storemanager.model.Roll;
import pl.sawickiadam.storemanager.repository.RollRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RollServiceImpl implements RollService {
    @Autowired
    RollRepository rollRepository;

    @Override
    public List<Roll> getRolls() {
        return rollRepository.findAll();
    }

    @Override
    public void saveRoll(Roll theRoll) {
        rollRepository.save(theRoll);
    }

    @Override
    @Transactional
    public Roll getRollById(Long theId) throws ResourceNotFoundException {
        return rollRepository.findById(theId).orElseThrow(
                () -> new ResourceNotFoundException(theId));
    }

    @Override
    public void deleteRoll(Long theId) {
        rollRepository.deleteById(theId);
    }

    @Override
    public List<Roll> findAllByName(String name) {
        return rollRepository.findAllByName(name);
    }

    @Override
    public Roll findByNameAndColorNumber(String name, int colorNumber) {
        return rollRepository.findByNameAndAndColorNumber(name, colorNumber);
    }
}
