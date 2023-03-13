package same_instance_strategy_demo;

public class Student extends Person {
    private int id;

    public Student(String name, int id) {
        super(name);
        this.id = id;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (!(obj instanceof Student)) {
//            return false;
//        }
//        Student student = (Student) obj;
//        return student.getName().equals(this.getName());
//    }
}
