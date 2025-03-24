package dev.sachith.cdc.processor;


import dev.sachith.cdc.dto.UserDto;

public interface DiscountChain {

    double getDiscount(UserDto user);

    double getDiscount(UserDto user, int index);

}
