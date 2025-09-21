class Manager extends Employee {
    private int teamSize;
    Manager(String name, int id, double salary, int teamSize) {
        super(name,id,salary); this.teamSize = teamSize;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("TeamSize: " + teamSize);
    }
}
