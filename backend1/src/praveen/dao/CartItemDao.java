package praveen.dao;

import praveen.model.Cart;
import praveen.model.CartItem;
import praveen.model.CustomerOrder;

public interface CartItemDao {
	
	void saveOrUpdateCartItem(CartItem cartItem);
	
	void removeCartItem(int cartItemId);
	
	Cart getCart(int cartId);
	
	CustomerOrder createOrder(Cart cart);

}

