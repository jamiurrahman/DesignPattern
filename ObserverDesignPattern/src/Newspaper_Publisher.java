import java.util.ArrayList;

public class Newspaper_Publisher implements Publisher{
	
	private ArrayList<Subscriber> subscriberList;
	private boolean The_New_York_Times;
	private boolean The_Guardian;
	private boolean BBC_News;
	
	public Newspaper_Publisher() {
		System.out.println("Into Newspaper_Publisher");
		subscriberList = new ArrayList<Subscriber>();
	}

	@Override
	public void subscribe(Subscriber s) {
		System.out.println("Into subscribe");
		//if (!subscriberList.contains(s)) {
			subscriberList.add(s);
		//}
	}

	@Override
	public void unsubscribe(Subscriber s) {
		System.out.println("Into unsubscribe");
		if (subscriberList.contains(s)) {
			subscriberList.remove(s);
		}
	}

	@Override
	public void notifyAllSubscribers() {
		System.out.println("Into notifyAllSubscribers");
		for (Subscriber s : subscriberList) {
			s.update(The_New_York_Times, The_Guardian, BBC_News);
		}
	}
	
	private void measurementChanged() {
		notifyAllSubscribers();
	}
	
	public void setNewSubscription(boolean The_New_York_Times, boolean The_Guardian, boolean BBC_News) {
		this.The_New_York_Times = The_New_York_Times;
		this.The_Guardian = The_Guardian;
		this.BBC_News = BBC_News;
		
		measurementChanged();
	}
	
}
