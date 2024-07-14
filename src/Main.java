//Thanapoom Chaisena 6510450437

import models.Register;
import models.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Thanapoom", "thanapoom.cha@ku.th", 20);
        User user2 = new User("Prakasit", "prakasit@dom1.cc", 21);
        Register register1 = new Register(user1);
        Register register2 = new Register(user2);
        register1.validate();
        register2.validate();
    }
}