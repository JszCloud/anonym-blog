# anonym-blog
博客系统

采用技术：

        SpringBoot多模块化开发
        SpringMVC
        Mybatis-Plus
        Shiro
        Redis
        MySQL
        swagger-ui接口开发
        lombok
        fastjson
        slf4j
 日志：
    2018.5.20
 
  ```java
   1、 
    @SpringBootApplication(scanBasePackages="cn.name168.anonym.blog")
    @MapperScan("cn.name168.anonym.blog.service.mapper")
    //启动类中配置扫描
    
   2、application配置加入service中的配置
      spring:
        profiles:
          active: service，prod(or dev),
    
  ```
