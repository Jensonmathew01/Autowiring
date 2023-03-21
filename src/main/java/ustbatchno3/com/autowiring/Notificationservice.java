package ustbatchno3.com.autowiring;

public class Notificationservice {
	private Messageservices messageservices;
	
	public void Notify()
	{
		messageservices.sendmessage("Hey I am autowire");
	}



	public void setMessageservices(Messageservices messageservices) {
		this.messageservices = messageservices;
	}
	
}
