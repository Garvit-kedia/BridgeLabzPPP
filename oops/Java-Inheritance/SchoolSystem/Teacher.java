class Teacher extends Person {
    private String subject;
    Teacher(String name,int age,String subject){ super(name,age); this.subject = subject; }
    void displayRole(){ display(); System.out.println("Teacher of " + subject); }
}
