package org.example.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private static Map<String, PrototypeCard> prototypes = new HashMap<>();
    public static PrototypeCard getInstance(final String type) throws CloneNotSupportedException{
        return prototypes.get(type).clone();
    }
    public static void loadCard(){
        Visa visa = new Visa();
        visa.setName("this card is Visa with number card 0000");
        prototypes.put(PrototypeCardType.VISA.getValue(),visa);

        Master master = new Master();
        master.setName("this card is MAster with number card 0000");
        prototypes.put(PrototypeCardType.MASTER.getValue(), master);
    }

}
