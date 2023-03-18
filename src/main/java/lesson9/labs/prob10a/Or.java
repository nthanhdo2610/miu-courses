package lesson9.labs.prob10a;

import java.util.*;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));
		Or or = new Or();
		System.out.println(or.someSimpleIsTrue(list));
	}

	public boolean someSimpleIsTrue(List<Simple> list) {
		return list.stream()
				.reduce(new Simple(false), (s1, s2) -> s2.flag ? s2 : s1).flag;
//		boolean accum = false;
//		for(Simple s: list) {
//			accum = accum || s.flag;
//		}
//		return accum;
	}

}
