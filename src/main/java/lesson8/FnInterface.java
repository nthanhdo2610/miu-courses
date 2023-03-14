package lesson8;

@FunctionalInterface
public interface FnInterface extends Comparable<String> {

    void aMethod();

    @Override
    default int compareTo(String o) {
        return 0;
    }
}
