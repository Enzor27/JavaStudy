
public class Dog {
    int age;
    String breed;
    String name;

    void say() {
        System.out.println("Gav-Gav");
    }

    @Override
    public String toString() {
        return "Dog[ name: " + name + " , breed: " + breed + " , age: " + age + "]";
    }
}
