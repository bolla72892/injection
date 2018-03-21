package info.inetsolv.InjectionWithXml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext container=new ClassPathXmlApplicationContext("spring.xml");
    	Person person = container.getBean(Person.class);
    	System.out.println(person.getPid());
    	System.out.println(person);
    	Address address = container.getBean(Address.class);
    	System.out.println(address.getCity());
    	System.out.println(person.getAddress().getCity());
    	((AbstractApplicationContext) container).close();
    }
}
