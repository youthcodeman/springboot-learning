package org.hzg.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot 运行流程分析
 *	1、判断当前是否是web环境 WebApplicationType.deduceFromClasspath()
 *  2、加载所有classpath下META-INF/ ApplicationContextInitializer （实现了这个接口的类会在容器刷新之前进行一个回调，会将configurableApplicationContext传进来）
 *  3、加载所有classpath下META-INF/ ApplicationListener（事件监听器，之前有说过事件监听器的注册方式包括配置文件和注解还有利用SpringApplication进行）
 *  4、利用这个方法获取main方法所在的类的class deduceMainApplicationClass()
 *
 *  5、开始执行run方法，其返回值是ConfigurableApplicationContext
 *  6、利用这个方法设置 java.awt.headless系统变量 configureHeadlessProperty()
 *  7、加载所有classpath下META-INF/ SpringApplicationRunListeners，利用这个方法this.getRunListeners(args)，这个类接口的目的就是在spring的运行过程中做一些事件通知
 *  8、开启SpringApplicationRunListeners 监听器
 *  9、根据args new一个ApplicationArguments
 *
 *  10、利用prepareEnvironment(listeners, applicationArguments)方法创建Environment
 *  11、利用configureEnvironment((ConfigurableEnvironment)environment, applicationArguments.getSourceArgs())方法配置environment，主要是把run方法的传的参配置进去
 *  12、利用listeners.environmentPrepared((ConfigurableEnvironment)environment),启动监听器
 *  13、如果没有自定义environment，则利用EnvironmentConverter进行一个转换，转换成一个标准的environment
 *  14、利用ConfigurationPropertySources.attach((Environment)environment)，来获取配置
 *  15、利用this.configureIgnoreBeanInfo(environment)，初始化igonre的bean信息
 *  16、输出banner
 *  17、利用createApplicationContext（）方法创建ApplicationContext并且强转成ConfigurableApplicationContext类型
 *  18、利用getSpringFactoriesInstances(SpringBootExceptionReporter.class, new Class[]{ConfigurableApplicationContext.class}, new Object[]{context})方法，创建错误报告
 *  19、利用this.prepareContext(context, environment, listeners, applicationArguments, printedBanner);准备applicationContext
 *		利用postProcessApplicationContext(context)方法调用applicationContext的后置处理器
 *	    利用applyInitializers(context);回调所有的ApplicationContextInitializer的initialize方法
 *	    利用listeners.contextPrepared(context);广播环境准备成功的事件
 *      依次往容器中注入applicationArguments，printedBanner对象
 *      加载所有的source到context中
 *      listeners.contextLoaded(context);广播context加载sorce成功
 *  20、利用this.refreshContext(context);刷新环境，注册一个registerShutdownHook
 *  21、listeners.started(context);广播springboot启动成功
 *  22、this.callRunners(context, applicationArguments);获取所有的ApplicationRunner、CommandLineRunner（spring容器加载完毕之后调用），先排序，然后依次调用runner方法
 *
 *
 *
 */
@SpringBootApplication
public class App {
    public static void main( String[] args ) {
    	SpringApplication app = new SpringApplication(App.class);
    	app.run(args);
    }
}
