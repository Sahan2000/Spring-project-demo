package lk.gdse.aad.springprojectdemo;

import lk.gdse.aad.springprojectdemo.config.WebAppConfig;
import lk.gdse.aad.springprojectdemo.config.WebAppRootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebAppRootConfig.class};
    } // register root configuration class

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebAppConfig.class};
    } // register servlet configuration class

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    } // front- controller design pattern
}
