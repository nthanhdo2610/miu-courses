package same_class_strategy_demo;

public class Student extends Person {
    private int id;

    public Student(String name, int id) {
        super(name);
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return student.getName().equals(this.getName());
    }
}
