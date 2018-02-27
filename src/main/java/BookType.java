public enum BookType {
    COMEDY("Funny"),
    HORROR("Scary"),
    THRILLER("Enthralling"),
    FANTASY("Pish");


    private final String description;

    BookType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}


