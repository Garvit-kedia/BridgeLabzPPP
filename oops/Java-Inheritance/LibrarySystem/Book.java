class Book {
    private String title;
    private int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    String getTitle() { return title; }
    int getPublicationYear() { return publicationYear; }
}
