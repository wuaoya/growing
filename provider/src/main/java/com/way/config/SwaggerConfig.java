package com.way.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * spring doc配置
 */
@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("growing API")
                        .description("wuaoya growing API page")
                        .version("1.0")
                        .license(new License().name("Apache 2.0")
                        .url("https://github.com/wuaoya/growing")))
                        .externalDocs(new ExternalDocumentation()
                        .description("API文档")
                        .url("/"));
    }

}
