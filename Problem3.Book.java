class Book extends Product {
    String author;
    String Isbn;
    Book(int productID, String name, double price, String author, String Isbn) {
        super(productID, name, price);
        this.author = author;
        this.Isbn = Isbn;
    }
    void getAuthorInfo() {
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + Isbn);
    }
}
