class Guest extends Person {
    Guest(String name, int id, int age) {
        super(name, id, age);
    }
    void viewCatalog() {
        System.out.println(name +  " is viewing the library catalog .");
    }
}
