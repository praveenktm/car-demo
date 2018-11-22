package niit.praveen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.Configuration.DBconfiguration;

import niit.dao.ProductDao;
import niit.model.Product;

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
//AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DBconfiguration.class,ProductDaoImpl.class);
ProductDao productDao= (ProductDao)context.getBean("ProductDaoImpl");
//ProductDao productService=(ProductService)context.getBean(ProductServiceImpl.class);
//Product product=productService.getProduct(2);
	  
	 // System.out.println(product.getProductdesc());
	// System.out.println(product.getQuantity());
//	 System.out.println(product.getPrice());
//	 System.out.println(product.getId()); 
  Product product=new Product();

//INSERTING AND UPDATING    
product.setPrice(2000);
product.setProductdesc("jeggin");
product.setProductdesc("jean");
product.setQuantity(2);
product.setId(1);
productDao.addProduct(product);
//   productDao.updateProduct(product);   */	     
}
}
