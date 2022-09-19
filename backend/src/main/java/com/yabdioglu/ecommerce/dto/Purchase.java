package com.yabdioglu.ecommerce.dto;

import com.yabdioglu.ecommerce.entity.Address;
import com.yabdioglu.ecommerce.entity.Customer;
import com.yabdioglu.ecommerce.entity.Order;
import com.yabdioglu.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
