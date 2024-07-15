package com.retail.discount.util;

import com.retail.discount.model.User;

public class DiscountCalculator {
	public static double calculateDiscount(User user, double billAmount, boolean isGrocery) {
		double percentageDiscount = 0;

		if (!isGrocery) {
			if (user.isEmployee()) {
				percentageDiscount = 0.30;
			} else if (user.isAffiliate()) {
				percentageDiscount = 0.10;
			} else if (user.isLoyalCustomer()) {
				percentageDiscount = 0.05;
			}
		}

		double percentageDiscountAmount = billAmount * percentageDiscount;
		double flatDiscountAmount = Math.floor(billAmount / 100) * 5;
		return billAmount - percentageDiscountAmount - flatDiscountAmount;
	}
}
