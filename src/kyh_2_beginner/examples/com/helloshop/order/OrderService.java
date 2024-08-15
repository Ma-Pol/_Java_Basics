package kyh_2_beginner.examples.com.helloshop.order;

import kyh_2_beginner.examples.com.helloshop.product.Product;
import kyh_2_beginner.examples.com.helloshop.user.User;

public class OrderService {

    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
