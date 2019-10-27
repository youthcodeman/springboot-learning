package org.hzg.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

/**
 * 1. 拦截器 实现HandlerInterceptor接口，然后利用继承WebMvcConfigurerAdapter，重写addInterceptors方法添加之前写好的拦截器
 * 2. 异常处理
 *      ErrorPageRegistrar 错误页面注册器，将错误码或者异常类和错误页面绑定起来（registerErrorPages方法）
 *      @ExceptionHandler 注解对异常类进行处理，可以统一处理也可以个性化处理
 *
 */
@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
public class App {
    public static void main( String[] args ) {
		SpringApplication.run(App.class,args);
    }
}
