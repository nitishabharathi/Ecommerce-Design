import java.util.Hashtable;

public class ItemCache {
	private static Hashtable<String, ItemDetails> itemMap  = new Hashtable<String, ItemDetails>();

	   public static ItemDetails getItem(String itemId) {
		   ItemDetails cachedItem = itemMap.get(itemId);
	      return (ItemDetails) cachedItem.clone();
	   }
}
