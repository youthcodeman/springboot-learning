package org.hzg.springboot.containerCustomer;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration;
import org.springframework.boot.autoconfigure.web.embedded.TomcatWebServerFactoryCustomizer;
import org.springframework.boot.web.embedded.tomcat.ConfigurableTomcatWebServerFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatContextCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * Created by hzgal on 2019-10-28.
 * 需要实现WebServerFactoryCustomizer接口，同时定义WebServerFactory的泛型。
 * 通过customize来进行自定义web服务的设置，可以添加自定义上下文和自定义连接器
 */
@Component
public class MyServetContainerCustomustomizer implements WebServerFactoryCustomizer<TomcatServletWebServerFactory> {

    /**
     * 自定义的tomcat参数设置的方式
     * @param factory
     */
    @Override
    public void customize(TomcatServletWebServerFactory factory) {
        //添加tomcat容器的自定义类，可以有多个
        factory.setTomcatContextCustomizers((Collection<? extends TomcatContextCustomizer>) new MyTomcatContextCustomizer());
        factory.addConnectorCustomizers(new TomcatConnectorCustomizer() {
            @Override
            public void customize(Connector connector) {
                connector.setMaxCookieCount(50);
                connector.setProperty("relaxedPathChars", "\"<>[\\]^`{|}");
                connector.setProperty("relaxedQueryChars", "\"<>[\\]^`{|}");
                connector.setScheme("http");
                Http11NioProtocol protocol = (Http11NioProtocol) connector.getProtocolHandler();
                // 设置最大缓冲区
                protocol.setMaxHttpHeaderSize(1024000);
                protocol.setPort(7788);
                // 设置最大连接数
                protocol.setMaxConnections(2000);
                // 设置tomcat的最大连接数
                protocol.setMaxThreads(500);
            }
        });
    }
}
