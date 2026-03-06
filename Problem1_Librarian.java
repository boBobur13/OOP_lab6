class Librarian extends Person {
    Librarian(String name, int id, int age) {
        super(name, id, age);
    }
    void addBook(String bookName) {
        System.out.println("Librarian added book: " + bookName);
    }
    void removeBook(String bookName) {
        System.out.println("Librarian removed book: " + bookName);
    }
    void issueBook(String bookName, String memberName) {
        System.out.println("Book '" + bookName + "' issued to " + memberName);
    }
}
