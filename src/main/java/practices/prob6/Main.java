package practices.prob6;

@User(name = "Edgar")
public class Main {

    // 6.	Create a user defined annotation and annotate the class. Get the annotation information from a main class.
    public static void main(String[] args) {
        if(Main.class.isAnnotationPresent(User.class)){
            User user = Main.class.getAnnotation(User.class);
            System.out.println(user.name());
        }
    }
}
