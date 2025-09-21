class Book {
    private String title;
    private int publicationYear;
    Book(String title, int publicationYear) {
        this.title = title; this.publicationYear = publicationYear;
    }
    void displayInfo() {
        System.out.println(title + " (" + publicationYear + ")");
    }
}
