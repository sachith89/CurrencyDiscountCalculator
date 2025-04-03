package dev.sachith.cdc.service;

import dev.sachith.cdc.domain.vo.ExchangeRates;
import reactor.core.publisher.Mono;

/**
 * @author sachith
 */
public interface CurrencyExchangeService {
    Mono<ExchangeRates> getAllData();
}
