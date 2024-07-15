package com.retail.discount.controller;

import com.retail.discount.model.User;
import com.retail.discount.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/discount")
public class DiscountController {
	@Autowired
	private DiscountService discountService;

	@PostMapping("/calculate")
	public double calculateDiscount(@RequestBody User user, @RequestParam double billAmount,
			@RequestParam boolean isGrocery) {
		return discountService.getNetPayableAmount(user, billAmount, isGrocery);
	}
}
