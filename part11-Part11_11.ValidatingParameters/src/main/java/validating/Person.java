package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if ( name == null || name.length() > 40 || name == "" || age < 0 || age > 120) {
            throw new IllegalArgumentException("Enter shorter name and/or age must be less than 120");
        } else {

            this.name = name;
            this.age = age;
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
