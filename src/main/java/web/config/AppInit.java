package web.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{JPAConfig.class}; // Конфигурации для сервисов и DAO
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class}; // Конфигурации для MVC
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}