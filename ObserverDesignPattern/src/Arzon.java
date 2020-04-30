
public class Arzon implements Subscriber,CurrentSubscriptionDisplay {

	private Publisher publisher;
	private boolean BBC_News;

	Arzon(Newspaper_Publisher newspaperPublisher) {
		this.publisher = newspaperPublisher;
		newspaperPublisher.subscribe(this);

	}

	@Override
	public void update(boolean The_New_York_Times, boolean The_Guardian, boolean BBC_News) {
		this.BBC_News = BBC_News;

		display();
	}

	@Override
	public void display() {
		System.out.println("For Arzon newspaper published :" + "\nBBC_News: " + this.BBC_News);
	}

}
