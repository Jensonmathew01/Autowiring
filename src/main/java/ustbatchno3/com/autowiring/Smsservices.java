package ustbatchno3.com.autowiring;

public class Smsservices implements Messageservices{

	public void sendmessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("I am from Sms services "+message);
		
	}

}
