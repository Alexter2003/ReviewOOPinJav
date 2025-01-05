package sales_system.sales;

public class Order {
    private static int counter = 0;
    private final int id;
    private static final int MAX_PRODUCTS = 5;
    private Product[] products;
    private int productsCounter = 0;

    public Order(){
        products = new Product[MAX_PRODUCTS];
        this.id = ++Order.counter;
    }

    public void addProduct(Product product){
        if(this.productsCounter < Order.MAX_PRODUCTS){
            this.products[this.productsCounter++] = product;
        } else{
            System.out.println("No more than " + Order.MAX_PRODUCTS + " products are allowed");
        }
    }

    public double calculateTotal(){
        double total = 0;
        for (Product product : products) {
            if (product != null) {
                total += product.getPrice();
            }
        }
        return total;
    }

    public void showOrder(){
        System.out.println("Order id: " + this.id);
        System.out.println("\tTotal of the order: " + this.calculateTotal());
        System.out.println("\tProducts of the order: ");
        for (Product product : products) {
            if (product != null) {
                System.out.println("\t\t" + product);
            }
        }

    }

}
