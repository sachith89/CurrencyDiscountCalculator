package dev.sachith.cdc.domain.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import dev.sachith.cdc.domain.discount.Discount;
import dev.sachith.cdc.domain.enums.Category;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

/**
 * @author sachith
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "category",
        "price",
        "discounts",
        "units",
        "total"
})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Item {
    private String name;
    private Category category;
    private BigDecimal price;
    private List<Discount> discounts;
    private Integer units;
    private BigDecimal total;
}