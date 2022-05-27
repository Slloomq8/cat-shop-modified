package catalogue;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BetterBasketTest {

    // ----------------------------------------------------------------
    /**
     * Asserts whether adding an existing product to better product only increases
     * the quantity and doesn't create a new entry
     */
    @Test
    public void add_addingSimilarProductsOnlyIncrementsQuantityOfProduct() {
        BetterBasket betterBasket = new BetterBasket();

        Product pr = new Product("0001", "Phone 2", 500.0, 1);

        betterBasket.add(pr);
        betterBasket.add(pr);

        assertEquals(1, betterBasket.size());
        assertEquals(2, betterBasket.get(0).getQuantity());
    }

    /**
     * Asserts whether adding a product positions the product in ascending
     * order according to product number
     */
    @Test
    public void add_addsProductInAscendingOrderAccordingToProductNumber() {
        BetterBasket betterBasket = new BetterBasket();

        Product pr = new Product("0005", "Phone 2", 500.0, 1);
        Product pr2 = new Product("0004", "Watch 2", 89.0, 1);
        Product pr3 = new Product("0002", "Smart TV 2", 1000.0, 1);
        Product pr4 = new Product("0001", "Camera TV 2", 247.3, 1);

        betterBasket.add(pr);
        betterBasket.add(pr);
        betterBasket.add(pr3);
        betterBasket.add(pr2);
        betterBasket.add(pr4);

        assertEquals("0001", betterBasket.get(0).getProductNum());
        assertEquals("0002", betterBasket.get(1).getProductNum());
        assertNotEquals("0005", betterBasket.get(0).getProductNum());
    }
}
