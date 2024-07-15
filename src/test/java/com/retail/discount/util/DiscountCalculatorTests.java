package com.retail.discount.util;

import com.retail.discount.model.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiscountCalculatorTests {
    @Test
    public void testEmployeeDiscount() {
        User user = new User(true, false, false);
        double netAmount = DiscountCalculator.calculateDiscount(user, 1000, false);
        assertEquals(665, netAmount);
    }

    @Test
    public void testAffiliateDiscount() {
        User user = new User(false, true, false);
        double netAmount = DiscountCalculator.calculateDiscount(user, 1000, false);
        assertEquals(855, netAmount);
    }

    @Test
    public void testLoyalCustomerDiscount() {
        User user = new User(false, false, true);
        double netAmount = DiscountCalculator.calculateDiscount(user, 1000, false);
        assertEquals(925, netAmount);
    }

    @Test
    public void testGroceryNoPercentageDiscount() {
        User user = new User(true, false, false);
        double netAmount = DiscountCalculator.calculateDiscount(user, 1000, true);
        assertEquals(955, netAmount);
    }

    @Test
    public void testNoDiscount() {
        User user = new User(false, false, false);
        double netAmount = DiscountCalculator.calculateDiscount(user, 1000, false);
        assertEquals(955, netAmount);
    }
}
