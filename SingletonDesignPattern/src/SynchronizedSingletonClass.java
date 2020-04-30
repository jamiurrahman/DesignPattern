
public class SynchronizedSingletonClass {
	private static SynchronizedSingletonClass uniqueInstance;
	
	private SynchronizedSingletonClass() {
		System.out.println("Creating an unique SynchronizedSingletonClass object");
	}
	
	// If we want thread safe Singleton Class then this is the most easier way to do.
	// But the problem is synchronized make the getInstance method 100 times slower than before.
	// So never use this way to make thread safe synchronized getInstace method.
	// We have two alternative ways to do the same thread safe way to build our getInstance method.
	public static synchronized SynchronizedSingletonClass getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SynchronizedSingletonClass();
		}
		
		return uniqueInstance;
	}

}
