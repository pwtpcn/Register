//Thanapoom Chaisena 6510450437
package models;

import services.AgeValidator;
import services.EmailValidator;
import services.NameValidator;
import services.Validator;

import java.util.Arrays;
import java.util.List;

public class Register {
    private final User user;
    List<Validator> validators = Arrays.asList(
            new NameValidator(),
            new EmailValidator(),
            new AgeValidator()
    );

    public Register(User user) {
        this.user = user;
    }

    public boolean validate() {
        for (Validator validator : validators) {
            validator.isValid(user);
        }
        System.out.println(user.getName() + " is valid");
        return true;
    }
}
