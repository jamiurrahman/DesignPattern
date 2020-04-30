
public class DoubleCheckVolatileSingletonClass {
	private static volatile DoubleCheckVolatileSingletonClass uniqueInstance;
	
	// This is also thread safe and faster than synchronized.
	// But the problem is with volatile keyword.
	// This code will compile from JAVA 5 or higher.
	// Below JAVA 5, JAVA does not have the support of volatile keyword.
	// In this way we are relying JVM and double check with synchronized block.
	private DoubleCheckVolatileSingletonClass() {
		System.out.println("Creating an unique DoubleCheckVolatileSingletonClass object");
	}
	
	public static DoubleCheckVolatileSingletonClass getInstance() {
		if (uniqueInstance == null) {
			synchronized (DoubleCheckVolatileSingletonClass.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new DoubleCheckVolatileSingletonClass();
				}
			}
		}
		
		return uniqueInstance;
	}

}
