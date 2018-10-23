package niit.praveen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.Configuration.DBconfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//System.out.println( "Hello World" );
    	ApplicationContext context=new AnnotationConfigApplicationContext(DBconfiguration.class);
    }
         
}   