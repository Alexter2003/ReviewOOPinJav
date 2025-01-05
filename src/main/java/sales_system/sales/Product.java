package sales_system.sales;

public class Product {
    private static int counter = 0;
    private final int id;
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
        this.id = ++Product.counter;
    }

    @Override
    public String toString() {
        return "Product{" + "id= " + id + ", name= '" + name + '\'' +", price= " + price +'}';
    }

    //GETTERS
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    //SETTERS

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

}

