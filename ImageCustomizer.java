
public class ImageCustomizer extends ItemsCustomizer{
	Item item;
	public ImageCustomizer(Item i)
	{
		this.item = i;
	}
	public void addCustomization() {
		if(item.isCustomizable())
		{
			// logic to add personalized image
		}
		
	}
}
