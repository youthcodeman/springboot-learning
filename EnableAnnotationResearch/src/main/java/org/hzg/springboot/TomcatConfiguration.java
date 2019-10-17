package org.hzg.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hzgal on 2019-10-17.
 */
@Configuration
@ConfigurationProperties(prefix = "tomcat")
public class TomcatConfiguration {

    private String host;
    private Integer port;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "TomcatConfiguration{" +
                "host='" + host + '\'' +
                ", port=" + port +
                '}';
    }
}
