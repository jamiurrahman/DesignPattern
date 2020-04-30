
public class Orin implements Subscriber, CurrentSubscriptionDisplay {

	private boolean The_New_York_Times;
	private boolean The_Guardian;
	private Publisher publisher;

	Orin(Newspaper_Publisher newspaperPublisher) {
		this.publisher = newspaperPublisher;
		newspaperPublisher.subscribe(this);
		
	}

	@Override
	public void update(boolean The_New_York_Times, boolean The_Guardian, boolean BBC_News) {
		this.The_New_York_Times = The_New_York_Times;
		this.The_Guardian = The_Guardian;

		display();
	}

	@Override
	public void display() {
		System.out.println("For Orin newspaper published :" + "\nThe New York Times: " + this.The_New_York_Times
				+ "\nThe Guardian: " + this.The_Guardian);
	}

}
