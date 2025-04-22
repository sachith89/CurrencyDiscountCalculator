package dev.sachith.cdc.service;

import dev.sachith.cdc.domain.entity.ShoppingCartEntity;
import dev.sachith.cdc.domain.dto.InvoiceDto;

/**
 * @author sachith
 */
public interface ShoppingCartService {

    InvoiceDto generateInvoice(ShoppingCartEntity shoppingCartEntity, String apiKey);
}
