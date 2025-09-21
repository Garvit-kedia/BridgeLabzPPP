public class Main {
    public static void main(String[] args) {
        Animal[] arr = { new Dog("Rex",4), new Cat("Mia",2), new Bird("Rio",1) };
        for(Animal a: arr) a.makeSound();
    }
}
