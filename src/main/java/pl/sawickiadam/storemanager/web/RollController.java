package pl.sawickiadam.storemanager.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.sawickiadam.storemanager.model.Roll;
import pl.sawickiadam.storemanager.repository.RollRepository;
import pl.sawickiadam.storemanager.service.ResourceNotFoundException;
import pl.sawickiadam.storemanager.service.RollService;
import pl.sawickiadam.storemanager.validator.RollValidator;

import java.util.List;

@Controller
public class RollController {
    @Autowired
    RollService rollService;
    @Autowired
    RollValidator rollValidator;

    @GetMapping("/all")
    public String allRolls(Model theModel) {
        List<Roll> theRolls = rollService.getRolls();
        theModel.addAttribute("rolls", theRolls);
        return "rollList";
    }
    @GetMapping("/saveRoll")
    public String saveRoll(Model model) {
        Roll theRoll = new Roll();
        model.addAttribute("roll", theRoll);
        return "rollForm";
    }
    @PostMapping("/saveRoll")
    public String saveRoll(@ModelAttribute("roll") Roll theRoll, BindingResult bindingResult) {
        rollValidator.validate(theRoll, bindingResult);
        if (bindingResult.hasErrors()) {
            return "rollForm";
        }
        rollService.saveRoll(theRoll);
        return "redirect:/all";
    }
    @GetMapping("/updateForm")
    public String updateUser(@RequestParam("rollId") long theId, Model theModel) throws ResourceNotFoundException {
        Roll theRoll = rollService.getRollById(theId);
        theModel.addAttribute("roll", theRoll);
        return "rollForm";
    }
    @GetMapping("/takeRoll")
    public String takeRoll(@RequestParam("rollId") long theId) throws ResourceNotFoundException {
        Roll theRoll = rollService.getRollById(theId);
        theRoll.decrement();
        rollService.saveRoll(theRoll);
        return "redirect:/all";
    }
}
