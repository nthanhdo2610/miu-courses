package lesson3.labs.prob1;

public class PersonWithJob {

    private double salary;

    // use composition
    private Person person;

    public Person getPerson() {
        return person;
    }

    public double getSalary() {
        return salary;
    }

    PersonWithJob(String n, double s) {
        this.person = new Person(n);
        this.salary = s;
    }

    public PersonWithJob(Person person) {
        this.person = person;
    }

    @Override
    public boolean equals(Object aPersonWithJob) {
        if (aPersonWithJob == null) return false;
        if (!(aPersonWithJob instanceof PersonWithJob p)) return false;
        return person.getName().equals(p.getPerson().getName()) &&
                this.getSalary() == p.getSalary();
    }

    public static void main(String[] args) {
        PersonWithJob p1 = new PersonWithJob("Joe", 30000);
        PersonWithJob p2 = new PersonWithJob(new Person("Joe"));
        //As PersonsWithJobs, p1 should be equal to p2
        System.out.println("p1.equals(p2)? " + p1.equals(p2));
        System.out.println("p2.equals(p1)? " + p2.equals(p1));
        /**
         * The instanceof operator works on the principle of the is-a relationship.
         * The concept of an is-a relationship is based on class inheritance or interface implementation.
         * Base on above and class PersonWithJob extends Person then:
         * The output: p1.equals(p2)? false => because Person p2 is not instanceof PersonWithJob p1
         * The output: p2.equals(p1)? true => PersonWithJob p1 is instanceof Person p2
         */
    }
}
