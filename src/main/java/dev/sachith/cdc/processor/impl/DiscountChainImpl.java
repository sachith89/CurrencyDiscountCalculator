package dev.sachith.cdc.processor.impl;

import dev.sachith.cdc.dto.UserDto;
import dev.sachith.cdc.processor.Discount;
import dev.sachith.cdc.processor.DiscountChain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DiscountChainImpl implements DiscountChain {

    private final List<Discount> discounts;

    @Autowired
    public DiscountChainImpl(List<Discount> discounts) {
        this.discounts = discounts;
    }

    @Override
    public double getDiscount(UserDto user) {
        return getDiscount(user, 0);
    }

    @Override
    public double getDiscount(UserDto user, int index) {
        if (index < discounts.size()) {
            return discounts.get(index).getDiscount(user, this, index);
        }
        return 0;
    }

}
