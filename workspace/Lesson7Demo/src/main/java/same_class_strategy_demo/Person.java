package same_class_strategy_demo;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        //apply same class strategy
        System.out.println(obj.getClass()); //class same_class_strategy_demo.Student
        System.out.println(obj.getClass() != this.getClass());
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return person.name.equals(this.name);
    }
}
