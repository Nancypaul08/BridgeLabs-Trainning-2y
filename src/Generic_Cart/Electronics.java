package Generic_Cart;

class Electronics {
    String name;
    Electronics(String name) {
        this.name = name;
    }
    public String toString() {
        return "Electronics: " + name;
    }
}

class Clothing {
    String type;
    Clothing(String type) {
        this.type = type;
    }
    public String toString() {
        return "Clothing: " + type;
    }
}

class Book {
    String title;
    Book(String title) {
        this.title = title;
    }
    public String toString() {
        return "Book: " + title;
    }
}
