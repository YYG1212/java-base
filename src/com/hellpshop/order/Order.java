package com.hellpshop.order;

import com.hellpshop.product.Product;
import com.hellpshop.user.User;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
