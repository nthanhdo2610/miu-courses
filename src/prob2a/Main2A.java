package prob2a;

import java.util.Date;

public class Main2A {

    public static void main(String[] args) {

        Student edgar = new Student("Edgar");
        edgar.setGradeReport(new GradeReport(edgar));

        Student eugene = new Student("Eugene");
        GradeReport report = new GradeReport(new Date(), eugene);

        System.out.println(edgar);
        System.out.println(eugene);
    }
}
