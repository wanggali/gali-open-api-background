package com.gali.api;

import com.gali.api.client.GaliApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * GaliApiClientConfig:
 *
 * @author gali
 * @date 2023/08/22
 */
@Data
@ConfigurationProperties("galiapi.client")
@Configuration
@ComponentScan
public class GaliApiClientConfig {
    private String accessKey;

    private String secretKey;

    @Bean
    public GaliApiClient galiApiClient() {
        return new GaliApiClient(accessKey, secretKey);
    }

}
