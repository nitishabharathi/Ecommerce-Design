
public class ItemBrowsing {
	private Customer user;
	private Item item;
	
	public ItemBrowsing(Customer user)
	{
		this.user = user;
	}
	
	public void addItem(Item item)
	{
		ItemHistory.getInstance().addItem(item);
	}
}
