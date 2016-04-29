
public class People {

    String name;
    String lastName;
    int age;

    Dog dog;


    @Override
    public String toString() {
        return "People [name: " + name + ", lastName: " + lastName + "," +
                " age: " + age + ", Have a Dog: " + dog + "]";
    }
}
