
public class ItemHistory {
	private static ItemHistory onlyInstance;
	private Item item;
	
	private ItemHistory() {
		
	}
	
	public static synchronized ItemHistory getInstance() {
		if(onlyInstance == null)
		{
			onlyInstance = new ItemHistory();
			
		}
		return onlyInstance;
	}
	
	
	public void addItem(Item item)
	{
		
	}
	
	public Item showHistory()
	{
		return item;
	}
}
