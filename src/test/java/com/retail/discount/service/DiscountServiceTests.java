package com.retail.discount.service;

import com.retail.discount.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class DiscountServiceTests {
    @Autowired
    private DiscountService discountService;

    @Test
    public void testEmployeeDiscount() {
        User user = new User(true, false, false);
        double netAmount = discountService.getNetPayableAmount(user, 1000, false);
        assertEquals(665, netAmount);
    }

    // Other test cases similar to DiscountCalculatorTests
}
