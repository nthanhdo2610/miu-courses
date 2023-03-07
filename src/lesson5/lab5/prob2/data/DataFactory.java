package lesson5.lab5.prob2.data;

import java.util.HashMap;

final public class DataFactory {

    static HashMap<String, Data> dataMap = new HashMap<>() {
        {
            put("Alice", new AliceData());
            put("Joe", new JoeData());
        }
        final static long serialVersionUID = 1L;
    };

    public DataFactory() {
    }

    public static Data getData(String username) {
        if (!dataMap.containsKey(username)) {
            throw new IllegalArgumentException("Data not found!");
        }
        return dataMap.get(username);
    }
}
