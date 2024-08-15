package kyh_2_beginner.com.helloshop.order;

import kyh_2_beginner.com.helloshop.product.Product;
import kyh_2_beginner.com.helloshop.user.User;

public class OrderSerivce {
    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
