package dev.sachith.cdc.processor;

import dev.sachith.cdc.domain.enums.UserType;
import dev.sachith.cdc.domain.vo.Item;
import dev.sachith.cdc.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
public abstract class Discount {

    public abstract boolean checkEligibility(UserDto user, Item item);
}
