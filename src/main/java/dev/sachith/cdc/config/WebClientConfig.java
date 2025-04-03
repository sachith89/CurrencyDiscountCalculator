package dev.sachith.cdc.config;

import dev.sachith.cdc.config.properties.CdcProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @author sachith
 */
@Configuration
@EnableConfigurationProperties(CdcProperties.class)
public class WebClientConfig {

    @Bean
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }

    @Bean
    WebClient webClient(WebClient.Builder webClientBuilder, CdcProperties cdcProperties) {
        return webClientBuilder.baseUrl(cdcProperties.getOpenExchange().getUrl()).build();
    }

}
