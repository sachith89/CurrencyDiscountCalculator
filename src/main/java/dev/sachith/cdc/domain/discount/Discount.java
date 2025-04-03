package dev.sachith.cdc.domain.discount;

import dev.sachith.cdc.domain.vo.Item;
import dev.sachith.cdc.domain.dto.UserDto;

public abstract class Discount {

    public abstract boolean checkEligibility(UserDto user, Item item);
}
