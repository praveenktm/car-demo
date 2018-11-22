package niit.dao;

import niit.model.Product;

public interface ProductDao {
void addProduct(Product product);
void updateProduct(Product product);
Product getProduct(int id);
void deleteProduct(int id);
}
