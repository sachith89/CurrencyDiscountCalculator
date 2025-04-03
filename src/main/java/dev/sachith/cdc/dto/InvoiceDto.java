package dev.sachith.cdc.dto;

import dev.sachith.cdc.domain.vo.Item;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceDto {

    @Valid
    @NotNull(message = "User must be present")
    private UserDto user;

    @Valid
    @NotEmpty(message = "There should be at least one item per invoice")
    private List<Item> items;

    private BigDecimal subTotal;

    private BigDecimal netAmount;

}
