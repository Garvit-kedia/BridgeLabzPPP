class Developer extends Employee {
    private String language;
    Developer(String name, int id, double salary, String language) {
        super(name,id,salary); this.language = language;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Language: " + language);
    }
}
