package org.example.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    public void addInterceptors(InterceptorRegistration registration){
        registration.addPathPatterns("/Route/**")
                .addPathPatterns("/Stop/**")
                .addPathPatterns("/Trip/**")
                .addPathPatterns("/h2-console/**")
                .addPathPatterns("/api/**");
    }

}
