import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartAppTest {

    @Test
    public void testCalculateTotalCost() {
        ShoppingCartApp shoppingCart = new ShoppingCartApp();
        // Test case 1: Normal values
        assertEquals(100.00, shoppingCart.calculateTotalCost(10.0, 10), 0.01);

        // Test case 2: Zero price (should return 0)
        assertEquals(0.00, shoppingCart.calculateTotalCost(0.0, 10), 0.01);

        // Test case 3: Zero quantity (should return 0)
        assertEquals(0.00, shoppingCart.calculateTotalCost(10.0, 0), 0.01);
    }

}