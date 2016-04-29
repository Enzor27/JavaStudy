
public class Main {

    static Dog dog = new Dog();
    static People people = new People();

    public static void main (String [] args) {

        dog.name = "Gary";
        dog.age = 1;
        dog.breed = "Chihua-Hua";

        people.name = "Ruslan";
        people.lastName = "Zosimov";
        people.age = 33;

        System.out.println(dog);
        System.out.println(people);
    }
}