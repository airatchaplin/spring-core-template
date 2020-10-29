package com.epam.edu.spring.core.template;

import com.epam.edu.spring.core.template.configuration.MainConfiguration;
import com.epam.edu.spring.core.template.service.SimpleItemService;
import org.junit.Test;
import org.junit.jupiter.api.TestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class InitializerConfigurationTest {

    ApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);

    @Test
    public void SimpleItemServiceForConstructor(){
        context.getBean("simpleItemServiceForConstructor",SimpleItemService.class);
    }

    @Test
    public void SimpleItemServiceForSetter(){
        context.getBean("simpleItemServiceForSetter",SimpleItemService.class);
    }
}
