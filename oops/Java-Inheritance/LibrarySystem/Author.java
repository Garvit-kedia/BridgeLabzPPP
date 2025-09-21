class Author extends Book {
    private String name;
    private String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println("Book: " + getTitle() + ", Year: " + getPublicationYear());
        System.out.println("Author: " + name + ", Bio: " + bio);
    }
}
