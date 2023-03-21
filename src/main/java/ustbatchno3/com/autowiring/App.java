package ustbatchno3.com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =new ClassPathXmlApplicationContext("Application.xml"); 
    	Notificationservice r=context.getBean(Notificationservice.class);
    	r.Notify();
    }
}
