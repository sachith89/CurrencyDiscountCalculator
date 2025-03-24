package dev.sachith.cdc.domain.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import dev.sachith.cdc.domain.enums.Category;

/**
 * @author sachith
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "category",
        "price"
})
public record Item
        (
                String name,
                Category category,
                Integer price
        ) {
}