/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.ArrayList;
import java.util.List;


public class DrivableTrader extends Trader<Drivable> {

    /**
     * Construct a DrivableTrader, giving them the
     * given inventory, wishlist, and money.
     *
     * @param inventory Objects in this Trader's inventory
     * @param wishlist  Objects in this Trader's wishlist
     * @param money     The Trader's money
     */
    public DrivableTrader(List<Drivable> inventory, List<Drivable> wishlist, int money) {
        super(inventory, wishlist, money);
    }

    /**
     * Construct a Trader object with the given money, but with an empty
     * inventory and empty wishlist
     * @param money     The Trader's money
     */
    public DrivableTrader(int money) {
        super(money);
    }

    /**
     * Returns the selling price of a Tradable item. If the item is not Tradable,
     * returns Tradable.MISSING_PRICE.
     *
     * @param item The item who's selling price we are interested in
     * @return
     */
    @Override
    public int getSellingPrice(Drivable item) {
        int super_price = super.getSellingPrice(item);

        if (super_price == Tradable.MISSING_PRICE) {
            return super_price;
        }

        return super_price + item.getMaxSpeed();
    }
}