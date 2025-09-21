class Staff extends Person {
    private String duty;
    Staff(String name,int age,String duty){ super(name,age); this.duty = duty; }
    void displayRole(){ display(); System.out.println("Staff Duty: " + duty); }
}
