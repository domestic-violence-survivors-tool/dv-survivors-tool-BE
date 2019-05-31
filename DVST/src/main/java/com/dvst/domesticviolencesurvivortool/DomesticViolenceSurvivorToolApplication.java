package com.dvst.domesticviolencesurvivortool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
public class DomesticViolenceSurvivorToolApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DomesticViolenceSurvivorToolApplication.class, args);

        DispatcherServlet dispatcherServlet = (DispatcherServlet) ctx.getBean("dispatcherServlet");
        dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
    }

}
