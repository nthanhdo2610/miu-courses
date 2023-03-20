package lesson12.anno;

@BugReport(assignedTo = "Edgar", severity = 5)
public class Code1 {

    @MyAnnotation
    public static String s1;
    @MyAnnotation(value = "Eugene")
    public static String s2;
}
