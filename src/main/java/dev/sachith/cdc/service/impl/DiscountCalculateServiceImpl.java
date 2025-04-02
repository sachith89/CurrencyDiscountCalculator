package dev.sachith.cdc.service.impl;

import dev.sachith.cdc.domain.discount.Discount;
import dev.sachith.cdc.domain.dto.InvoiceDto;
import dev.sachith.cdc.domain.dto.UserDto;
import dev.sachith.cdc.domain.entity.ShoppingCartEntity;
import dev.sachith.cdc.domain.vo.Item;
import dev.sachith.cdc.service.DiscountCalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sachith
 */
@Service
class DiscountCalculateServiceImpl implements DiscountCalculateService {

    private final List<Discount> discounts;

    @Autowired
    public DiscountCalculateServiceImpl(List<Discount> discounts) {
        this.discounts = discounts;
    }

    @Override
    public InvoiceDto calculate(ShoppingCartEntity shoppingCartEntity) {

        List<Item> items = shoppingCartEntity.items();
        items.forEach(item -> {
            applyDiscount(item, shoppingCartEntity.user());
        });

        return null;
    }

    @Override
    public void applyDiscount(Item item, UserDto userDto) {

    }
}
