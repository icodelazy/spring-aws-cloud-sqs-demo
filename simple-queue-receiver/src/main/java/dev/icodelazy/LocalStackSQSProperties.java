package dev.icodelazy;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties("cloud.aws")
public class LocalStackSQSProperties {

    private String region;
    @NestedConfigurationProperty
    private final Credentials credentials = new Credentials();
    private String endPoint;

    @Getter
    @Setter
    public static class Credentials {
        private String accessKey;
        private String secretKey;
    }

}
