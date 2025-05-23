package dev.sachith.cdc.service.impl;

import dev.sachith.cdc.domain.vo.ExchangeRates;
import dev.sachith.cdc.service.CurrencyExchangeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sachith
 */
@SpringBootTest
class CurrencyExchangeServiceImplTest {

    @Value("${API_KEY}")
    private String apiKey;

    @Autowired
    private CurrencyExchangeService currencyExchangeService;

    @Test
    void testCurrencyExchangeServiceAPI() {

        ExchangeRates exchangeRates = currencyExchangeService.getAllData(apiKey);

        assert exchangeRates != null;

        assertEquals("USD", exchangeRates.base());
    }
}