class Student extends Person {
    private String grade;
    Student(String name,int age,String grade){ super(name,age); this.grade = grade; }
    void displayRole(){ display(); System.out.println("Student Grade " + grade); }
}
