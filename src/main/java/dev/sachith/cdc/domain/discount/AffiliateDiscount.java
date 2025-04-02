package dev.sachith.cdc.domain.discount;


import dev.sachith.cdc.domain.vo.Item;
import dev.sachith.cdc.domain.dto.UserDto;
import org.springframework.stereotype.Component;

/**
 * @author sachith
 */
@Component
class AffiliateDiscount extends PercentageDiscount {

    @Override
    public boolean checkEligibility(UserDto user, Item item) {
        return false;
    }

}
