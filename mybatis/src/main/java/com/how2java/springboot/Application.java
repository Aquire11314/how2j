package com.how2java.springboot;
 
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
//通过使用@MapperScan可以指定要扫描的Mapper类的包的路径,则Mapper类上面就不用添加注解@Mapper
@SpringBootApplication
@MapperScan("com.how2java.springboot.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        
    }
 
}