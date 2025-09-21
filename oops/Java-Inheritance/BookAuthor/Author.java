class Author extends Book {
    private String name;
    private String bio;
    Author(String title, int year, String name, String bio) {
        super(title, year); this.name = name; this.bio = bio;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}
