package dev.sachith.cdc.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import dev.sachith.cdc.domain.vo.Item;
import dev.sachith.cdc.domain.dto.UserDto;

import java.util.List;

/**
 * @author sachith
 */
@JsonPropertyOrder({
        "items",
        "user",
        "currency"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public record ShoppingCartEntity(
        List<Item> items,
        UserDto user,
        String currency
) {
}
