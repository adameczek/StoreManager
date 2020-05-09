package pl.sawickiadam.storemanager.service;

import pl.sawickiadam.storemanager.model.Roll;

import java.util.List;

public interface RollService {
    public List<Roll> getRolls();
    public void saveRoll(Roll theRoll);
    public Roll getRollById(Long theId) throws ResourceNotFoundException;
    public void deleteRoll(Long theId);
    List<Roll> findAllByName(String name);
    Roll findByNameAndColorNumber(String name, int colorNumber);
}
