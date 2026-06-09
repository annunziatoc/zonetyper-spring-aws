package zonetyper.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins("http://localhost:5173",
                        "https://www.zonetyper.com",
                        "http://zonetyper-env.eba-rmhzpncr.us-east-1.elasticbeanstalk.com",
                        "d2ktnoucdxz6f6.cloudfront.net",
                        "https://zonetyper.com")
                .allowedMethods("*")
                .allowedHeaders("*");
    }
}