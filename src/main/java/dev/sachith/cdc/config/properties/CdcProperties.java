package dev.sachith.cdc.config.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author sachith
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "cdc")
public class CdcProperties {

    private OpenExchangeProperties openExchange;

}
