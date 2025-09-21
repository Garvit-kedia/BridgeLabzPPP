public class Main {
    public static void main(String[] args) {
        Employee[] staff = {
            new Manager("Alice",1,90000,5),
            new Developer("Bob",2,70000,"Java"),
            new Intern("Charlie",3,20000,"StateU")
        };
        for(Employee e: staff) e.displayDetails();
    }
}
