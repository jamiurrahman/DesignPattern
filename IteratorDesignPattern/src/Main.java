
public class Main {

	public static void main(String[] args) {
		LunchMenu lunchMenu = new LunchMenu();
		DinerMenu dinerMenu = new DinerMenu();
		
		Waitress waitress = new Waitress(lunchMenu, dinerMenu);
		waitress.printMenu();
	}

}
