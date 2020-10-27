
public class ItemDetails extends Item implements Cloneable{
	public String itemID;
	public String itemName;
	public int quantity;
	public float cost;
	public boolean inStock = true;
	public String sellerInfo;
	
	private String getItemID() {
		return itemID;
	}

	private String getItemName() {
		return itemName;
	}

	
	private float getCost() {
		return cost;
	}


	private String getSellerInfo() {
		return sellerInfo;
	}

/*
	private String getItemDetail()
	{
		String seller = getSellerInfo();
		String cost = Float.toString(getCost());
		String id = getItemID();
		String name = getItemName();
		return name+seller+cost+id;
	}
	*/
	public Object clone() {
	      Object clone = null;
	      
	      try {
	         clone = super.clone();
	         
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }
	      
	      return clone;
	   }
}
