package praveen.dao;

import java.util.List;

import praveen.model.Category;
import praveen.model.Product;


public interface ProductDao {
	

	List<Product> getAllProducts(); //select * from product
	Product getProduct(int id);
	boolean deleteProduct(int id); //delete from product where id=?
	List<Category> getCategories();
	boolean saveOrUpdateProduct(Product product);

	
	
}

