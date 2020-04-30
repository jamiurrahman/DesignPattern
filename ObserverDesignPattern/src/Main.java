
public class Main {

	public static void main(String[] args) {
		Newspaper_Publisher newspaper_publisher = new Newspaper_Publisher();
		Orin orin = new Orin(newspaper_publisher);
		Arzon arzon = new Arzon(newspaper_publisher);
		
		System.out.println("After 1st publication: ");
		newspaper_publisher.setNewSubscription(true, false, true);
		
		newspaper_publisher.unsubscribe(orin);
		System.out.println("After 2nd publication: ");
		newspaper_publisher.setNewSubscription(true, true, true);
		
		newspaper_publisher.subscribe(orin);
		newspaper_publisher.unsubscribe(arzon);
		System.out.println("After 1st publication: ");
		newspaper_publisher.setNewSubscription(false, false, true);
		
	}

}
