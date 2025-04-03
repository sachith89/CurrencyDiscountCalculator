package dev.sachith.cdc.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import dev.sachith.cdc.domain.enums.UserType;
import dev.sachith.cdc.domain.vo.Item;

import java.util.List;

/**
 * @author sachith
 */
@JsonPropertyOrder({
        "items",
        "userType",
        "customerTenure",
        "originalCurrency",
        "targetCurrency"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public record ShoppingCartEntity(
        List<Item> items,
        UserType userType,
        Integer customerTenure,
        String originalCurrency,
        String targetCurrency
) {
}
