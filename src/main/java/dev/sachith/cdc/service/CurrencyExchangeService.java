package dev.sachith.cdc.service;

import dev.sachith.cdc.domain.vo.ExchangeRates;

/**
 * @author sachith
 */
public interface CurrencyExchangeService {
    ExchangeRates getAllData(String apiKey);
}
