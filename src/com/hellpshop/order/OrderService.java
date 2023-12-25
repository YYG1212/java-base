package com.hellpshop.order;

import com.hellpshop.product.Product;
import com.hellpshop.user.User;

public class OrderService {

    public void order(){
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
