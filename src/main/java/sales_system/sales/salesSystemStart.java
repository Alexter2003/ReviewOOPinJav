package sales_system.sales;

import java.util.Scanner;

public class salesSystemStart {
    //variables
    private final Scanner sc = new Scanner(System.in);
    private static final int MAX_AVAILABLE_PRODUCTS = 5;
    private static final int MAX_ORDERS = 5;

    private Order[] orders = new Order[MAX_ORDERS];
    private int numberOfOrders = 0;
    private final Product[] availableProducts = new Product[MAX_AVAILABLE_PRODUCTS];
    private int numberOfProductsAdded = 0;
    private boolean exitSystem = false;

    public void start() {

        while (!exitSystem) {
            System.out.println("** Sales System**");
            System.out.println("1. Add Products to sell");
            System.out.println("2. Add Order");
            System.out.println("3. View your orders");
            System.out.println("4. Exit");
            System.out.print("Choose a option: ");
            int option = Integer.parseInt(sc.nextLine());

            if (option == 1) {
                addProductsToSell(availableProducts);
            } else if (option == 2) {
                addOrder(orders);
            } else if (option == 3) {
                viewOrders(orders);
            } else if (option == 4) {
                exitSystem = true;
            }
        }

    }

    private void addProductsToSell(Product[] products) {
        if(numberOfProductsAdded < salesSystemStart.MAX_AVAILABLE_PRODUCTS){
            System.out.print("Name of the product: ");
            String name = sc.nextLine();
            System.out.print("Price of the product: ");
            double price = Double.parseDouble(sc.nextLine());

            products[numberOfProductsAdded++] = new Product(name, price);
            System.out.println("Product created \n");
        } else {
            System.out.println("You cannot add more than " + salesSystemStart.MAX_AVAILABLE_PRODUCTS + " products");
        }
    }

    private void addOrder(Order[] orders) {
        if(numberOfOrders < salesSystemStart.MAX_ORDERS){
            Order newOrder = new Order();
            int option = 0;
            do{
                System.out.println("Choose a product to add to the order");
                for (int i = 0; i < numberOfProductsAdded; i++) {
                    System.out.println(i + ". " + "Name: " + availableProducts[i].getName() + " - " + "Price: "+ availableProducts[i].getPrice());
                }
                System.out.print("Choose a product: ");
                int productSelected = Integer.parseInt(sc.nextLine());

                if(availableProducts[productSelected] != null){
                    newOrder.addProduct(availableProducts[productSelected]);
                } else {
                    System.out.println("Product not found");
                }

                System.out.println("Do you want to add another product to the order?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                option = Integer.parseInt(sc.nextLine());

            }while(option != 2);
            orders[numberOfOrders++] = newOrder;
        } else {
            System.out.println("You cannot add more than " + salesSystemStart.MAX_ORDERS + " orders");
        }
    }

    private void viewOrders(Order[] orders) {
        for (Order order : orders) {
            if(order != null){
                order.showOrder();
            }
        }
    }

}
