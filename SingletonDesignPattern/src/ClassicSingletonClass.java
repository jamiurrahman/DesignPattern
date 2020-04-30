
public class ClassicSingletonClass {
	private static ClassicSingletonClass uniqueInstance;
	
	private ClassicSingletonClass() {
		System.out.println("Creating an unique ClassicSingletonClass object");
	}
	
	public static ClassicSingletonClass getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new ClassicSingletonClass();
		}
		
		return uniqueInstance;
	}

}
