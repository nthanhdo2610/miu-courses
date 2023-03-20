package lesson9.labs.prob12;

import java.util.Optional;

public class MySingletonLazy {

    public static MySingletonLazy instance = null;

    public static MySingletonLazy getInstance() {
        if (Optional.ofNullable(instance).isEmpty())
            instance = new MySingletonLazy();
        return instance;
    }

    private MySingletonLazy() {
    }
}
