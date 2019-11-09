package com.nanwulife.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 张文军
 * @Description: TODO:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/11/26:14
 */
@SpringBootConfiguration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket webApiConfig() {

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("webApi")
                .apiInfo(webApiInfo())
                .select()
//                .paths(Predicates.not(PathSelectors.regex("/admin/.*")))
//                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                .build();

    }

    /*@Bean
    public Docket adminApiConfig() {

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("adminApi")
                .apiInfo(adminApiInfo())
                .select()
                .paths(Predicates.and(PathSelectors.regex("/admin/.*")))
                .build();

    }*/


    private ApiInfo webApiInfo() {

        return new ApiInfoBuilder()
                .title("NJAU-农业大学工学院-API文档")
                .description("本文档描述了服务接口")
                .version("1.0")
                .contact(new Contact("NJAU-It", "http://njauit.cn", "18860956371@163.com"))
                .build();
    }

   /* private ApiInfo adminApiInfo() {

        return new ApiInfoBuilder()
                .title("NJAU--后台管理系统-课程中心API文档")
                .description("本文档描述了后台管理系统课程中心微服务接口定义")
                .version("1.0")
                .contact(new Contact("NJAU-It", "http://njauit.cn", "18860956371@163.com"))
                .build();
    }*/
}
