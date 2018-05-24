package cn.name168.anonym.blog.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.name168.anonym.blog.service.mapper")//配置扫描mapper
public class AnonymBlogApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnonymBlogApiApplication.class, args);
	}
}
