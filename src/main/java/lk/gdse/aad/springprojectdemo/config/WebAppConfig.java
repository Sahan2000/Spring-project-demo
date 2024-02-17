package lk.gdse.aad.springprojectdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "lk.gdse.aad.springprojectdemo")
@EnableWebMvc
public class WebAppConfig {
}
