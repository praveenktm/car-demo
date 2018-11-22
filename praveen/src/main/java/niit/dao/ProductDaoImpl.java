package niit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import niit.model.Product;
@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public ProductDaoImpl() {
		System.out.println("ProductDaoImpl bean is created b");
	}
	
	public void addProduct(Product product) {
		
		Session session=sessionFactory.openSession();
		session.save(product);
		session.flush();
	}
	
	public void updateProduct(Product product) {
		Session session=sessionFactory.openSession();
		session.update(product);
		session.flush();
	}
	
	public Product getProduct(int id) {  	
		Session session=sessionFactory.getCurrentSession();
		Product product=(Product)session.get(Product.class,id);
		return product;
	}
	
	public void deleteProduct(int id) {
		Session session=sessionFactory.getCurrentSession();
		Product product=(Product)session.get(Product.class,id);
		session.delete(product);//delete from product where id=1
	}
}
