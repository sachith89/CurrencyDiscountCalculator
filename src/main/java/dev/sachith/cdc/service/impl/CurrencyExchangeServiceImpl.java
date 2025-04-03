package dev.sachith.cdc.service.impl;

import dev.sachith.cdc.domain.vo.ExchangeRates;
import dev.sachith.cdc.service.CurrencyExchangeService;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

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
    public Mono<ExchangeRates> getAllData() {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/api/latest.json")
                        .queryParam("app_id", "726e253850b74d9eb56cfd7f7c3fde4c")
                        .queryParam("base", "USD").build())
                .retrieve()
                .bodyToMono(ExchangeRates.class);
    }

}
