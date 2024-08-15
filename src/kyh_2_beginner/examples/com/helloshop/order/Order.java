package kyh_2_beginner.examples.com.helloshop.order;

import kyh_2_beginner.examples.com.helloshop.product.Product;
import kyh_2_beginner.examples.com.helloshop.user.User;

public class Order {

    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
