package carorderapp;

public abstract class Product {
    //Instance variable
    private String name;

    //Getter for name
    public String getName() {
        return name;
    }

    public Product(String name) {
        this.name = name;
    }
}
