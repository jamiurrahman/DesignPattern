
public class Main {

	public static void main(String[] args) {
		ClassicSingletonClass classicObject = ClassicSingletonClass.getInstance();
		SynchronizedSingletonClass synchronizedObject = SynchronizedSingletonClass.getInstance();
		EagerSingletonClass eagerObject = EagerSingletonClass.getInstance();
		DoubleCheckVolatileSingletonClass volatileObject = DoubleCheckVolatileSingletonClass.getInstance();
		
		// Running for second time but not creating any new object.
		ClassicSingletonClass classicObject_2 = ClassicSingletonClass.getInstance();
		SynchronizedSingletonClass synchronizedObject_2 = SynchronizedSingletonClass.getInstance();
		EagerSingletonClass eagerObject_2 = EagerSingletonClass.getInstance();
		DoubleCheckVolatileSingletonClass volatileObject_2 = DoubleCheckVolatileSingletonClass.getInstance();

	}

}
