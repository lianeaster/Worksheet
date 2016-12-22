package main.ua.kiev.prog.javapro;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 22.12.2016.
 */
public interface Maps {
    Map<String, String> parameters = new HashMap<String, String>() {
        {
            put("firstName", "first name");
            put("lastName", "last name");
            put("age", "age");
            put("pet", "pet");
            put("city", "city");
        }
    };
}
