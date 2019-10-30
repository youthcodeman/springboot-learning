###自己开发一个 springboot starter步骤

#### 1 新建一个项目
#### 2 需要一个配置类，在其中构造自己所实现的功能的bean
#### 3 将自己的starter依赖加入到所需项目，启用方式有两种
第一种注解的方式，在EnableRedis 中import自定义的配置类
        
第二种交给springboot自动扫描在自定义stater的resource目录下
//新建 /META-INF/spring.factories 增加配置项org.springframework.boot.autoconfigure.EnableAutoConfiguration=com.edu.spring.boot.redis.RedisAutoConfiguration

