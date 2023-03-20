package lesson12.anno;

public class Main {

    public static void main(String[] args) {
        Class<Code1> class1Class = Code1.class;
        Class<Code2> class2Class = Code2.class;

        // Is annotation present
        if(class1Class.isAnnotationPresent(BugReport.class)){
            // Get data
            BugReport bugReport = class1Class.getAnnotation(BugReport.class);
            System.out.println(bugReport.assignedTo() + ", "+bugReport.severity());

        }
        if(class1Class.isAnnotationPresent(MyAnnotation.class)){
            // Get data
            MyAnnotation myAnnotation = class1Class.getAnnotation(MyAnnotation.class);
            System.out.println(myAnnotation.value());

        }
        if(class2Class.isAnnotationPresent(BugReport.class)){
            // Get data
            BugReport bugReport = class2Class.getAnnotation(BugReport.class);
            System.out.println(bugReport.assignedTo() + ", "+bugReport.severity());
        }

    }
}
