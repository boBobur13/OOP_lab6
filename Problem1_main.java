class LibrarySystem {
    public static void main(String[] args) {
        Librarian lib = new Librarian("Ali", 1, 40);
        Member mem = new Member("Bobur", 2, 19);
        Guest guest = new Guest("Sara", 3, 22);
        System.out.println("---- Librarian Info ----");
        lib.displayInfo();
        lib.addBook("Java basics");
        lib.issueBook("Java basics", "Bobur");
        System.out.println("\n--- Member Info ---");
        mem.displayInfo();
        mem.borrowBook("Java basics");
        mem.viewBorrowedBooks();
        mem.returnBook("Java basics");
        System.out.println("\n---- Guest Info ----");
        guest.displayInfo();
        guest.viewCatalog();
    }
}
