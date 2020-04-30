
public class EagerSingletonClass {
	// This way we can rely on JVM.
	// this is also thread safe and faster than synchronized.
	// If we want heavy loaded getInstance method than we can do in this way.
	private static EagerSingletonClass uniqueInstance = new EagerSingletonClass();
	
	private EagerSingletonClass() {
		System.out.println("Creating an unique EagerSingletonClass object");
	}
	
	public static EagerSingletonClass getInstance() {
		
		return uniqueInstance;
	}

}
