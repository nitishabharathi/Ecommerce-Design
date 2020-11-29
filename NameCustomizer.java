
public class NameCustomizer extends ItemsCustomizer {
	Item item;
	public NameCustomizer(Item i)
	{
		this.item = i;
	}
	public void addCustomization() {
		if(item.isCustomizable())
		{
			// logic to add personalized name
		}
		
	}
}
