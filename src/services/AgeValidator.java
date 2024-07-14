//Thanapoom Chaisena 6510450437
package services;

import models.User;

public class AgeValidator implements Validator{

    @Override
    public void isValid(User user){
        if( user.getAge() < 20 ) {
            throw new IllegalArgumentException("Age should more than 20 years");
        }
    }
}
