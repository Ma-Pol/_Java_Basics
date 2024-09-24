package kyh_3_intermediate2.collection.map.ex.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int quantity) {
        cartMap.put(product, cartMap.getOrDefault(product, 0) + quantity);
    }

    public void minus(Product product, int quantity) {
        Integer tempQuantity = cartMap.get(product);

        if (tempQuantity == null) {
            return;
        }

        if (tempQuantity - quantity <= 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, tempQuantity - quantity);
        }
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println("상품: " + entry.getKey() + " 수량: " + entry.getValue());
        }
    }
}
