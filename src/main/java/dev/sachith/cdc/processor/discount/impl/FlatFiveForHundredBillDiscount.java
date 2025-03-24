package dev.sachith.cdc.processor.discount.impl;

import dev.sachith.cdc.domain.vo.Item;
import dev.sachith.cdc.dto.UserDto;
import dev.sachith.cdc.processor.discount.FlatDiscount;

/**
 * @author sachith
 */
public class FlatFiveForHundredBillDiscount extends FlatDiscount {

    @Override
    public boolean checkEligibility(UserDto user, Item item) {
        return false;
    }

}
