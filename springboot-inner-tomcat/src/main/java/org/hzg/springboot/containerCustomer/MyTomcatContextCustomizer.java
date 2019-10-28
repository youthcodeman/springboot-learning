package org.hzg.springboot.containerCustomer;

import org.apache.catalina.Context;
import org.springframework.boot.web.embedded.tomcat.TomcatContextCustomizer;

/**
 * Created by hzgal on 2019-10-29.
 * tomcat 容器的自定义
 */
public class MyTomcatContextCustomizer implements TomcatContextCustomizer {
    @Override
    public void customize(Context context) {

    }
}
