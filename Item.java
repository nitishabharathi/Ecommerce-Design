import java.util.ArrayList;

abstract class Item {
	public String itemID;
	public String itemName;
	private int quantity;
	public float cost;
	public boolean inStock = true;
	public boolean customizable;
	
	public Item() {
		super();
		quantity = 1;
		inStock = true;
	}

	public Item(boolean customizable)
	{
		quantity = 1;
		inStock = true;
		this.customizable = customizable;
	}
	
	public boolean isInStock() {
        return inStock;
    }
	public boolean isCustomizable() {
		return customizable;
	}
	
	public void updateCost(float cost) 
	{
		
	}
	public void updateQuantity(int no)
	{
		
	}
	
	public void removeItem(int quantity)
	{
		
	}
	public void addCustomer(Observer o)
	{
		
	}
	 
    public void removeCustomer(Observer o)
    {
    	
    }
 
    public void notifyCustomer()
    {
    	
    }
}
