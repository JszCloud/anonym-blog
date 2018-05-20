package cn.name168.anonym.blog.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages="cn.name168.anonym.blog")
@MapperScan("cn.name168.anonym.blog.service.mapper")
public class AnonymBlogAdminApplication {

	public static void main(String[] args) {
		System.out.println("***************************************************************");
		System.out.println("启动后台管理...");
		SpringApplication app = new SpringApplication(AnonymBlogAdminApplication.class);
		app.run(args);
	}
}
