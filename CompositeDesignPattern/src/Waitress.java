
public class Waitress {
	
	MenuComponent allMenus;
	
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
	
	public void print() {
		this.allMenus.print();
	}

}
