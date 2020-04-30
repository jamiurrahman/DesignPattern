import java.util.ArrayList;

public class LunchMenu implements Menu {
	ArrayList<MenuItem> menuItems;
	
	public LunchMenu() {
		menuItems = new ArrayList<MenuItem>();
		addItem("Bread and butter", 5);
		addItem("Bread and Egg", 3);
		addItem("Vegi Burger", 7);
	}

	private void addItem(String name, int price) {
		menuItems.add(new MenuItem(name, price));
	}
	
	public Iterator createIterator() {
		return new LunchMenuIterator(menuItems);
	}
}
