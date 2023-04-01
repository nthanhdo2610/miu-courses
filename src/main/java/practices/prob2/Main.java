package practices.prob2;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        LinkedList<Set<String>> lst = new LinkedList<>();
        lst.add(new LinkedHashSet<>(List.of(new String[]{"A", "B"})));
        lst.add(new LinkedHashSet<>(List.of(new String[]{"D"})));
        lst.add(new LinkedHashSet<>(List.of(new String[]{"1", "3", "5"})));
        System.out.println(union(lst));
    }

    //2.	Implement a method
    // public Set<String> union(List<Set<String>> sets)
    // by creating a stream pipeline that transforms a list of sets (of type String) into the union of those sets.
    // Make use of the reduce method for streams.
    public static Set<String> union(List<Set<String>> sets){
            try {
                return sets.stream().reduce(new LinkedHashSet<>(), (s1, s2) -> {
                    LinkedHashSet<String> set = new LinkedHashSet<>();
                    set.addAll(new LinkedHashSet<>(s1));
                    set.addAll(new LinkedHashSet<>(s2));
                    return set;
                });
            } catch(Exception e){
                throw new IllegalStateException("sdasd");

            }
    }
}
