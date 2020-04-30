
public class DinerMenu implements Menu {
	MenuItem[] menuItems;
	int numberOfItem = 0;
	int MAX_NUMBER = 2;
	
	public DinerMenu() {
		menuItems = new MenuItem[MAX_NUMBER];
		addItem("Rice and fish", 22);
		addItem("Rice and meat", 35);
		addItem("Rice and vegi", 11);
	}

	private void addItem(String name, int price) {
		if(numberOfItem >= MAX_NUMBER) {
			System.out.println("Can not add any new MenuItem because the item is overflowed.");
		}
		else {
			menuItems[numberOfItem] = new MenuItem(name, price);
			numberOfItem++;
		}
	}
	
	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}
}
