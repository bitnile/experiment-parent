package com.nanwulife;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author 张文军
 * @Description: TODO:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/11/105:51
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.nanwulife.dao")
public class ExperimentCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExperimentCoreApplication.class, args);
    }
}
