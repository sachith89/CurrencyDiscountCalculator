package dev.sachith.cdc.domain.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Map;

/**
 * @author sachith
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"disclaimer", "license", "timestamp", "base", "rates"})
public record ExchangeRates(@JsonProperty("disclaimer") String disclaimer, @JsonProperty("license") String license,
                            @JsonProperty("timestamp") Integer timestamp, @JsonProperty("base") String base,
                            @JsonProperty("rates") Map<String, Double> rates) {
}
