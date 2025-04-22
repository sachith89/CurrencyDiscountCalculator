package dev.sachith.cdc.service.impl;

import dev.sachith.cdc.domain.vo.ExchangeRates;
import dev.sachith.cdc.service.CurrencyExchangeService;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @author sachith
 */
@Service
class CurrencyExchangeServiceImpl implements CurrencyExchangeService {

    private final WebClient webClient;

    public CurrencyExchangeServiceImpl(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public ExchangeRates getAllData(String apiKey) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/api/latest.json")
                        .queryParam("app_id", apiKey)
                        .queryParam("base", "USD").build())
                .retrieve()
                .bodyToMono(ExchangeRates.class)
                .block();
    }

}
