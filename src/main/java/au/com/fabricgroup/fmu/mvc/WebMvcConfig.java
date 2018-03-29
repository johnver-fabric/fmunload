package au.com.fabricgroup.fmu.mvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/test").setViewName("test");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/").setViewName("forward:/home");
        registry.addViewController("/file").setViewName("file");
    }
}
