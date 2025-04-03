package dev.sachith.cdc.service.impl;

import dev.sachith.cdc.domain.entity.ShoppingCartEntity;
import dev.sachith.cdc.dto.InvoiceDto;
import dev.sachith.cdc.service.ShoppingCartService;
import org.springframework.stereotype.Service;

/**
 * @author sachith
 */
@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Override
    // @Transactional // Uncomment this line when using a database and require transaction management
    public InvoiceDto generateInvoice(ShoppingCartEntity shoppingCartEntity) {
        return null;
    }

}
