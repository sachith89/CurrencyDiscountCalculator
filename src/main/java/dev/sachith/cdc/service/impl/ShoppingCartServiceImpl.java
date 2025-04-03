package dev.sachith.cdc.service.impl;

import dev.sachith.cdc.domain.entity.ShoppingCartEntity;
import dev.sachith.cdc.domain.dto.InvoiceDto;
import dev.sachith.cdc.service.CurrencyExchangeService;
import dev.sachith.cdc.service.DiscountCalculateService;
import dev.sachith.cdc.service.ShoppingCartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author sachith
 */
@Service
@RequiredArgsConstructor
class ShoppingCartServiceImpl implements ShoppingCartService {

    private final CurrencyExchangeService currencyExchangeService;
    private final DiscountCalculateService discountCalculateService;

    // @Transactional
    // Uncomment this line when using a database and require transaction management
    @Override
    public InvoiceDto generateInvoice(ShoppingCartEntity shoppingCartEntity) {

        InvoiceDto invoiceDto = discountCalculateService.calculate(shoppingCartEntity);
        return null;
    }

}
