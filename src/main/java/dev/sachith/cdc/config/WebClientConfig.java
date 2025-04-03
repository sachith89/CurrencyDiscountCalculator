package dev.sachith.cdc.config;

import dev.sachith.cdc.config.properties.CDCProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @author sachith
 */
@Configuration
@RequiredArgsConstructor
@EnableConfigurationProperties(CDCProperties.class)
public class WebClientConfig {

    private final CDCProperties properties;

    @Bean
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }

    @Bean
    WebClient webClient(WebClient.Builder webClientBuilder) {
        return webClientBuilder.baseUrl(properties.getOpenExchange().getUrl()).build();
    }

}
