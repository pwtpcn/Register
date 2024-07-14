//Thanapoom Chaisena 6510450437
package services;

import models.User;

public class NameValidator implements Validator{
    @Override
    public void isValid(User user) {
        if (user.getName() == null || user.getName().trim().equals("")) {
            throw new IllegalArgumentException("Name should not empty");
        }
        if ( !user.getName().matches("[a-zA-Z]+")){
            throw new IllegalArgumentException("Name is wrong format");
        }
    }
}
