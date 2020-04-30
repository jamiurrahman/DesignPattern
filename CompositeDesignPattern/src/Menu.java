import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
	
	ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	String name;
	
	public Menu(String name) {
		this.name = name;
	}
	
	public void add(MenuComponent newMenuComponent) {
		menuComponents.add(newMenuComponent);
	}
	
	public void remove(MenuComponent newMenuComponent) {
		menuComponents.remove(newMenuComponent);
	}
	
	public MenuComponent getChild(int i) {
		return menuComponents.get(i);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void print() {
		System.out.println("  " + getName() + " : ");
		
		Iterator<MenuComponent> iterator = this.menuComponents.iterator();
		while(iterator.hasNext()) {
			iterator.next().print();
		}
	}
}
