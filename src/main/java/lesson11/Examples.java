package lesson11;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;

public class Examples {

    public static void main(String[] args) {
//        exam1();
//        exam2();
//        Object ob = exam3(1, 2.0);
//        System.out.println(ob);
//        exam4();
//        exam5();
//        List<?> list = List.of(1,"one");
//        System.out.println(list);
//        exam6();
//        exam7();
        List<Integer> list = List.of(1,2, null,3);
        list.add(4);
        // { opening curly bracket
        // } closing curly bracket
        // < opening angular bracket
        // > closing angular bracket
        System.out.println(list);
    }

    static void exam7() {
        Integer[] arr1 = initNumberArray(5);//size as 5
        System.out.println(arr1.length);
        Float[] arr2 = initNumberArray(2.6f);//..size as 2
        System.out.println(arr2.length);
    }

    static <T extends Number> T[] initNumberArray(T t){
        T[] arrT = null; // do not instantiate as new T[5]
        arrT = (T[]) Array.newInstance(t.getClass(), t.intValue());
        return arrT;
    }

    static void exam6() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        Integer i = list.iterator().next();
        System.out.println(i);
    }

    static void exam5() {
        B2Class<Integer, Float> B2 = new B2Class<>(100, 20f);
        System.out.println(B2.getI());
        System.out.println(B2.getJ());
        B1Class B1 = new B1Class(100, 20f);
        System.out.println(B1.getI());
        System.out.println(B1.getJ());
    }

    static void exam4() {
        ExtendedTypeParameter.fun(100);
    }

    static <T, U, V> V exam3(T i, U j) {
        return (V) (i + " - " + j);
    }

    static void exam2() {

        Generic2Class<Integer, Float> generic2Class = new Generic2Class<>(1, 2f);
        System.out.println(generic2Class.getI());
        System.out.println(generic2Class.getJ());

    }

    static void exam1() {

        GenericClass<Integer> integerGenericClass = new GenericClass<>(10);
        System.out.println(integerGenericClass.getData());

        GenericClass<Float> floatGenericClass = new GenericClass<>(11f);
        System.out.println(floatGenericClass.getData());

    }
}
