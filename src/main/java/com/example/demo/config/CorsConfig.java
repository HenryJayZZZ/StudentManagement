package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")  // 允许所有路径
                        .allowedOriginPatterns("*")  // 允许所有前端域访问（包括 localhost:5173）
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // 允许的请求方法
                        .allowedHeaders("*")         // 允许任何请求头
                        .allowCredentials(true);      // 允许携带Cookie（如需）
            }
        };
    }
}
