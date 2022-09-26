/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }

    /* TODO: Write a method named addDrivable that takes a String (the ID)
     *       and a Drivable object. If the ID string does not appear as a key
     *       in drivable_map, then add the pair to drivable_map.
     *       Return true if the Drivable was added to drivable_map.
     */

    /**
     * Add a drivable object and its ID to drivable_map.
     * @param itemID the ID of the Drivable object
     * @param item  the Drivable object
     * @return true if the object and ID pair were added to drivable_map
     */
    public boolean addDrivable(String itemID, Drivable item) {
        if (this.drivable_map.containsKey(itemID)) {
            return false;
        }
        this.drivable_map.put(itemID, item);
        return true;
    }




    /* TODO: Write a method named hasFasterThan that takes an int (a speed)
     *       and returns true iff there is at least one item in drivable_map
     *       that has a maxSpeed >= the speed given.
     * You may want to use drivable_map.keys() or drivable_map.values() to
     * iterate through drivable_map.
     */

    /**
     * Returns true if drivable_map contains at least one Drivable object
     * with a max speed faster than the given speed
     * @param speed The threshold speed to be checked
     * @return  True if the condition is met
     */
    public boolean hasFasterThan(int speed) {
        for (Drivable item : this.drivable_map.values()) {
            if (item.getMaxSpeed() >= speed) {
                return true;
            }
        }
        return false;
    }




    /* TODO: Write a method named getTradable that takes no arguments and
     *       returns a List containing all of the Tradable items in
     *       drivable_map.
     */

    /**
     * @return ArrayList of Tradable items in drivable_map
     */
    public List<Tradable> getTradable() {
        ArrayList<Tradable> tradableItems = new ArrayList<>();

        for (Drivable item : this.drivable_map.values()) {
            if (item instanceof Tradable) {
                tradableItems.add((Tradable) item);
            }
        }
        return tradableItems;
    }



    
}