package CustomExceptions;

import javax.xml.datatype.DatatypeConfigurationException;

public class GreetingsNewClient extends DatatypeConfigurationException {
    public static void show() {
        Greeting_to_new_client("Hi! Taras");
    }
    public static void Greeting_to_new_client(String name) {
        System.out.println(name.toUpperCase());
    }
}
