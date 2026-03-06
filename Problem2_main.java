public class OnlineShoppingSystem {
   public static void main(String[] args) {
        Electronics phone = new Electronics(131, "Smartphone", 799.99, 24, "Samsung");
        Clothing shirt = new Clothing(132, "T-Shirt", 25.50, "M", "Red");
        Book book = new Book(133, "Java programming", 40.00, "Ali Valiev", "0067965432");
        System.out.println("----- Electronics -----");
        phone.displayProductDetails();
        phone.getWarrantyDetails();
        System.out.println("\n----- Clothing -----");
        shirt.displayProductDetails();
        shirt.checkSizeAvailability();
        System.out.println("\n----- Book -----");
        book.displayProductDetails();
        book.getAuthorInfo();
    }
}
