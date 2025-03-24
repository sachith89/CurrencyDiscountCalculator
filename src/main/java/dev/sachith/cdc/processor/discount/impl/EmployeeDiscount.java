package dev.sachith.cdc.processor.discount.impl;


import dev.sachith.cdc.domain.vo.Item;
import dev.sachith.cdc.dto.UserDto;
import dev.sachith.cdc.processor.discount.PercentageDiscount;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDiscount extends PercentageDiscount {

    @Override
    public boolean checkEligibility(UserDto user, Item item) {
        return false;
    }

}
