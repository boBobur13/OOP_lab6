class Electronics extends Product {
    int warranty; 
    String brand;
    Electronics(int productID, String name, double price, int warranty, String brand) {
        super(productID, name, price);
        this.warranty = warranty;
        this.brand = brand;
    }
    void getWarrantyDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Warranty:" + warranty + " months");
    }
}
