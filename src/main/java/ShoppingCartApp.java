import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ShoppingCartApp {
    public double calculateItemCost(double price, int quantity){
        return price * quantity;
    }
    public static void main(String [] args){
        ShoppingCartApp shoppingCart = new ShoppingCartApp();
        System.out.println("Select language: 1. Finnish 2. Swedish 3. English 4. Japanese");
        Locale locale;
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch(choice){
            case 1:
                locale = new Locale("fi", "FI");
                break;
            case 2:
                locale = new Locale("sv", "SE");
                break;
            case 3:
                locale = new Locale("en", "US");
                break;
            case 4:
                locale = new Locale("ja", "JP");
                break;
            default:
                System.out.println("Invalid choice. Default set to English.");
                locale = new Locale("en", "US");
        }

        ResourceBundle rb;
        rb = ResourceBundle.getBundle("messages", locale);
        System.out.println(rb.getString("items"));
        int items = scanner.nextInt();
        double total = 0;
        for (int i = 0; i < items; i++){
            System.out.println(rb.getString("price"));
            System.out.println(i+1 +":");
            double price = scanner.nextDouble();
            System.out.println(rb.getString("quantity"));
            int quantity = scanner.nextInt();
            total += shoppingCart.calculateItemCost(price, quantity);
        }
        System.out.println(rb.getString("total") + total);
    }
}
