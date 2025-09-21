public class Main {
    public static void main(String[] args) {
        PaidOnlineCourse p = new PaidOnlineCourse("Java Master",30,"Udemy",true,100.0,20.0);
        System.out.println(p.details());
        System.out.println("Final Fee: " + p.finalFee());
    }
}
