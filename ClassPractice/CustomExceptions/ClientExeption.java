package CustomExceptions;

import CustomExceptions.AgesExeption;

public class ClientExeption {
    private String kid;
    private int age;
    public ClientExeption(String kid, int age) throws AgesExeption {
        if (age <18){
            throw new AgesExeption("New passenger as kid who is traveling alone without parents can't take order for taxi. Forbidden use taxi for person younger than: " + age);
        }
    }
}
