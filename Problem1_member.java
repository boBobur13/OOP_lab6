class Member extends Person {
    Member(String name, int id, int age) {
        super(name, id, age);
    }
    void borrowBook(String bookName) {
        System.out.println(name + " borrowed book: " + bookName);
    }
    void returnBook(String bookName) {
        System.out.println(name + " returned book: " + bookName);
    }
    void viewBorrowedBooks() {
        System.out.println(name + " is viewing borrowed books.");
    }
}
