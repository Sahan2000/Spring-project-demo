package lk.gdse.aad.springprojectdemo.teory;

import lk.gdse.aad.springprojectdemo.teory.config.WebAppConfig;
import lk.gdse.aad.springprojectdemo.teory.config.WebAppRootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected java.lang.Class<?>[] getRootConfigClasses() {
        return new java.lang.Class[]{WebAppRootConfig.class};
    } // register root configuration class

    @Override
    protected java.lang.Class<?>[] getServletConfigClasses() {
        return new java.lang.Class[]{WebAppConfig.class};
    } // register servlet configuration class

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    } // front- controller design pattern
}
