package com.fsindustry.debussy.metaserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 程序入口
 *
 * @author fuzhengxin
 */
@SpringBootApplication
@MapperScan(basePackages = {
        "com.fsindustry.debussy.metaserver.topic.dao"
})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
