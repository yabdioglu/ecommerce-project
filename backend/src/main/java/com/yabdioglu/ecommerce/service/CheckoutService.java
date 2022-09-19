package com.yabdioglu.ecommerce.service;

import com.yabdioglu.ecommerce.dto.Purchase;
import com.yabdioglu.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
