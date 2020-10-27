
import java.util.ArrayList;

public class ItemNotify extends Item {
	// List of Customers Registered for Notification
 
	private ArrayList<Observer> customers = new ArrayList<Observer>();
	private boolean inStock = true;
	 
    // Getter for inStock
    public boolean isInStock() {
        return inStock;
    }
 
    // Setter for inStock
    public void setInStock(boolean inStock) {
        this.inStock = inStock;
        notifyCustomer();
    }
 
    @Override
    public void addCustomer(Observer o) {
        customers.add(o);
    }
 
    @Override
    public void removeCustomer(Observer o) {
        customers.remove(o);
    }
 
    @Override
    public void notifyCustomer() {
        // Logic implementation to notify the users
    }
 
}
