class Intern extends Employee {
    private String school;
    Intern(String name, int id, double salary, String school) {
        super(name,id,salary); this.school = school;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("School: " + school);
    }
}
