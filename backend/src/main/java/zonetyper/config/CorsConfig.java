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
                        "api.zonetyper.com",
                        "https://www.zonetyper.com",
                        "https://zonetyper.com")
                .allowedMethods("*")
                .allowedHeaders("*");
    }
}