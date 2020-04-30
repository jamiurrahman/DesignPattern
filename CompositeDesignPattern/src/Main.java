
public class Main {

	public static void main(String[] args) {
		MenuComponent dinerMenu = new Menu("Diner Menu");
		MenuComponent lunchMenu = new Menu("Lunch Menu");
		MenuComponent dessertMenu = new Menu("Dessert Menu");
		
		MenuComponent vegiAndRice = new MenuItem("Vegi and Rice", 11);
		MenuComponent chickenAndRice = new MenuItem("Chicken and Rice", 15);
		MenuComponent beefAndRice = new MenuItem("Beef and Rice", 19);
		MenuComponent starter = new MenuItem("Starter", 3);
		MenuComponent soup = new MenuItem("Soup", 5);
		MenuComponent sweet = new MenuItem("Sweet", 2);
		MenuComponent fruits = new MenuItem("Fruits", 7);
		MenuComponent iceCream = new MenuItem("Ice-cream", 9);
		
		dessertMenu.add(sweet);
		dessertMenu.add(iceCream);
		
		dinerMenu.add(soup);
		dinerMenu.add(beefAndRice);
		dinerMenu.add(vegiAndRice);
		dinerMenu.add(dessertMenu);
		
		lunchMenu.add(fruits);
		lunchMenu.add(starter);
		lunchMenu.add(vegiAndRice);
		lunchMenu.add(chickenAndRice);
		
		MenuComponent allMenus = new Menu("All Menus");
		allMenus.add(lunchMenu);
		allMenus.add(dinerMenu);
		
		Waitress waitress = new Waitress(allMenus);
		waitress.print();
	}

}
