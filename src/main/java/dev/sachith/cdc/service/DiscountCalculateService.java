package dev.sachith.cdc.service;

import dev.sachith.cdc.domain.dto.InvoiceDto;
import dev.sachith.cdc.domain.dto.UserDto;
import dev.sachith.cdc.domain.entity.ShoppingCartEntity;
import dev.sachith.cdc.domain.vo.Item;

/**
 * @author sachith
 */
public interface DiscountCalculateService {

    InvoiceDto calculate(ShoppingCartEntity shoppingCartEntity);

    void applyDiscount(Item item, UserDto userDto);
}
