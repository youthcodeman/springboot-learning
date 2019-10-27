package org.hzg.springboot.errorresolve;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * Created by hzgal on 2019-10-28.
 * 这里是对错误的统一处理，即实现ErrorPageRegistrar接口，
 * ErrorPage(HttpStatus status, String path) 将错误界面和错误码绑定起来
 * ErrorPage(Class<? extends Throwable> exception, String path) 将错误界面和指定异常绑定起来
 */
@Component
public class CommonErrorPageRegistry implements ErrorPageRegistrar {
    @Override
    public void registerErrorPages(ErrorPageRegistry errorPageRegistry) {
        ErrorPage errorPage404 = new ErrorPage(HttpStatus.NOT_FOUND,"/404.html");
        ErrorPage errorPage500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"/500.html");
        ErrorPage errorPageNullPointer= new ErrorPage(NullPointerException.class,"/nullPointer.html");
        errorPageRegistry.addErrorPages(errorPage404,errorPage500,errorPageNullPointer);
    }
}
