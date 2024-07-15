package com.retail.discount.service;

import com.retail.discount.model.User;
import com.retail.discount.util.DiscountCalculator;
import org.springframework.stereotype.Service;

@Service
public class DiscountService {
    public double getNetPayableAmount(User user, double billAmount, boolean isGrocery) {
        return DiscountCalculator.calculateDiscount(user, billAmount, isGrocery);
    }
}
