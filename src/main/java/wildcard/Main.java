package wildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // A <- B <- C <- D


    public static void main(String[] args) {
        List<? super B> lst1 = new ArrayList<A>();
        lst1.add(new B());
        lst1.add(new C());
        lst1.add(new D());

        List<? extends B> lst2 = new ArrayList<D>();
//        lst2.add(0, new C());
//        lst2.add(1, new D());
//        lst2.remove(1);

//        List<? extends Object> lst3 = new ArrayList<>();
//        List<? super Object> lst3 = new ArrayList<>();
//        List<?> lst3 = new ArrayList<>();
//        List<Object> lst3 = new ArrayList<>();
//        lst3.add(new A());
//        lst3.add(new B());
//        lst3.add(new C());
//        lst3.add(new D());
    }
}
