
public class Waitress {
	Menu lunchMenu;
	Menu dinerMenu;
	
	public Waitress(Menu lunchMenu, Menu dinerMenu) {
		this.lunchMenu = lunchMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu() {
		Iterator iterator_lunch = this.lunchMenu.createIterator();
		Iterator iterator_diner = this.dinerMenu.createIterator();
		
		System.out.println("Printing Lunch Menu:");
		printMenu(iterator_lunch);
		System.out.println("Printing Diner Menu:");
		printMenu(iterator_diner);
	}

	private void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.println(menuItem.getName() + " : " + menuItem.getPrice());
		}
	}
}
