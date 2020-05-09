package pl.sawickiadam.storemanager.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.ValidationUtils;
import pl.sawickiadam.storemanager.model.Roll;
import pl.sawickiadam.storemanager.service.RollService;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class RollValidator implements Validator {
    @Autowired
    RollService rollService;

    @Override
    public boolean supports(Class<?> aClass) {
        return Roll.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Roll roll = (Roll) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "field.required");
        if (rollService.findByNameAndColorNumber(roll.getName(), roll.getColorNumber()) != null) {
            errors.rejectValue("name", "Duplicate.rollForm.name");
        }
    }
}
